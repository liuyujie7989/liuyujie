package com.dk.alibaba.platform.parser;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.StrUtil;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public abstract class ResponseParser<T> {

    protected static ObjectMapper mapper = new ObjectMapper();

    static {
        mapper.setDefaultPropertyInclusion(JsonInclude.Include.ALWAYS);
        // 反序列化时忽略json中比bean中多的字段
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    }

    public abstract T parse(String response) throws ResponseParseException;

    protected String getResult(String response, String responseName, List<String> fields) throws IOException {
        if (StrUtil.isEmpty(response)) {
            throw new RuntimeException("没有返回结果");
        }
        JsonNode rootNode = mapper.readTree(response);
        JsonNode headNode = rootNode.get("UNI_BSS_HEAD");

        if (headNode == null) {
            throw new RuntimeException("返回结果没有 HEAD");
        }
        String respCode = headNode.get("RESP_CODE").asText();
        String respDesc = headNode.get("RESP_DESC").asText();

        if ("00000".contains(respCode)) {
            JsonNode bodyNode = rootNode.get("UNI_BSS_BODY");
            if (bodyNode == null) {
                return null;
            }
            JsonNode rspNode = bodyNode.get(responseName);

            ObjectNode result = mapper.createObjectNode();
            handleNodeObject(result, rspNode, fields);
            return mapper.writeValueAsString(result);
        } else {
            throw new RuntimeException(String.format("请求结果失败，%s：%s", respCode, respDesc));
        }
    }

    /**
     * JSON 对象
     *
     * @param objectNode
     * @param jsonNode
     * @param fields
     */
    private void handleNodeObject(ObjectNode objectNode, JsonNode jsonNode, List<String> fields) {
        Iterator<String> fieldNames = jsonNode.fieldNames();
        while(fieldNames.hasNext()) {
            String fieldName = fieldNames.next();
            JsonNode node = jsonNode.get(fieldName);
            fieldName = toCamel(fieldName); // 驼峰
            if (JsonNodeType.OBJECT == node.getNodeType()) {
                ObjectNode object = mapper.createObjectNode();
                objectNode.set(fieldName, object);
                handleNodeObject(object, node, fields);
            } else if (JsonNodeType.ARRAY == node.getNodeType()) {
                ArrayNode array = mapper.createArrayNode();
                objectNode.set(fieldName, array);
                handleNodeArray(array, node, fields);
            } else {
                boolean nullFlag = false;
                // 要处理的字段
                if (CollectionUtil.isNotEmpty(fields) && fields.contains(fieldName)) {
                    nullFlag = true;
                }
                // "" 转 null
                if (JsonNodeType.STRING == node.getNodeType() && nullFlag) {
                    objectNode.set(fieldName, null);
                } else {
                    objectNode.set(fieldName, node);
                }
            }
        }
    }

    /**
     * JSON 数组
     *
     * @param arrayNode
     * @param jsonNode
     * @param fields
     */
    private void handleNodeArray(ArrayNode arrayNode, JsonNode jsonNode, List<String> fields) {
        Iterator<JsonNode> nodes = jsonNode.elements();
        while(nodes.hasNext()) {
            JsonNode node = nodes.next();
            if (JsonNodeType.OBJECT == node.getNodeType()) {
                ObjectNode object = mapper.createObjectNode();
                arrayNode.add(object);
                handleNodeObject(object, node, fields);
            } else if (JsonNodeType.ARRAY == node.getNodeType()) {
                ArrayNode array = mapper.createArrayNode();
                arrayNode.add(array);
                handleNodeArray(array, node, fields);
            } else {
                arrayNode.add(node);
            }
        }
    }

    /**
     * 下划线转驼峰
     *
     * @param name
     * @return
     */
    private String toCamel(String name) {
        StringBuilder buf = new StringBuilder(name);
        for (int i = 0; i < buf.length(); i++) {
            // 大写A-Z 变成小写 a-z
            if ('A' <= buf.charAt(i) && buf.charAt(i) <= 'Z') {
                buf.setCharAt(i, Character.toLowerCase(buf.charAt(i)));
            }
            // _ 后面的字符变成大写
            if (i > 0 && buf.charAt(i-1) == '_') {
                buf.setCharAt(i, Character.toUpperCase(buf.charAt(i)));
            }
        }
        return buf.toString().replaceAll("_", "");
    }
}

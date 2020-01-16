/*
 * Copyright (c) 2017 西安才多信息技术有限责任公司。
 * 项目名称：dev
 * 文件名称：JsonObjectUtils.java
 * 日期：17-6-30 上午8:58
 * 作者：yangyan
 *
 */

package com.dk.alibaba.platform.util;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;

/**
 * JsonObjectUtils
 * @Author ycx.
 */
public class JsonObjectUtils {

    public static ObjectMapper m = new ObjectMapper();

    static {

        // 此配置的作用为当使用此工具将json中的属性还原到bean时，如果有bean中没有的属性，是否报错
        m.configure(FAIL_ON_UNKNOWN_PROPERTIES, false);
        m.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);

    }

    /**
     * json 转换成 bean
     *
     * @param <T>
     * @param json
     * @param clazz
     * @return
     */
    public static <T> T jsonToBean(String json, Class<T> clazz) {
        if (json == null || clazz == null) {
            return null;
        }
        try {
            return m.readValue(json, clazz);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * json node 转换成bean
     *
     * @param node
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T nodeToBean(JsonNode node, Class<T> clazz) {
        if (node == null || clazz == null) {
            return null;
        }
        try {
            return m.treeToValue(node, clazz);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * bean 转换成 json
     *
     * @param bean
     * @return
     */
    public static String objectToJson(Object bean) {

        if (bean == null) {
            return null;
        }
        try {
            return m.writeValueAsString(bean);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * bean 转换成 json
     *
     * @param bean
     * @return
     */
    public static String beanToJson(Object bean) {

        if (bean == null) {
            return null;
        }
        try {
            return m.writeValueAsString(bean);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static JsonNode stringToJsonNode(String jsonString) {
        if (jsonString == null) {
            return null;
        }
        try {
            return m.readTree(jsonString);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static <T, A extends List<T>> A jsonToList(String jsonString, TypeReference<List<T>> clazz) throws JsonParseException, JsonMappingException, IOException {
        return (A) m.readValue(jsonString, clazz);
    }

    public static <T> List<T> jsonToList(JsonNode jsonNode, Class<T> clazz) throws JsonParseException, JsonMappingException, IOException {
        if (jsonNode.isArray()) {
            List<T> list = new ArrayList<>();
            Iterator<JsonNode> iterator = jsonNode.iterator();
            while (iterator.hasNext()) {
                JsonNode next = iterator.next();
                Object o = nodeToBean(next, clazz);
                list.add((T) o);
            }
            return list;
        }
        return null;
    }

}

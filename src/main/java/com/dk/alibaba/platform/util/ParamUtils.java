package com.dk.alibaba.platform.util;

import com.alibaba.fastjson.JSONObject;
import com.dk.alibaba.platform.auth.ProviderPass;
import com.dk.alibaba.platform.http.AppRequest;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @author doukang
 * @description 参数处理
 * @date 2019/9/25 10:00
 */
public class ParamUtils {

    /**
     * 根据参数对象生成请求信息JSON
     *
     * @param providerPass
     * @param requestName
     * @param object
     * @return
     */
    public static String createRequestBody(ProviderPass providerPass, String requestName, Object object) {
        Map<String,Object> requestMap = convertObjToMap(object);
        AppRequest appRequest = new AppRequest(providerPass, requestName, requestMap);
        return JsonObjectUtils.beanToJson(appRequest.toMap());
    }

    /**
     * 将参数对象转换成map
     *
     * @param object
     * @return
     */
    private static Map<String, Object> convertObjToMap(Object object) {
        Map<String, Object> map = new HashMap<>();
//        ImmutableMap.Builder<String, Object> builder = ImmutableMap.builder();
        if (object == null) {
//            return builder.build();
            return map;
        }
        Class cls = object.getClass();
        for (Field field : cls.getDeclaredFields()) {
            try {
                field.setAccessible(true);
                String fieldName = convertFieldName(field.getName());
                Object value = field.get(object);
                if (value != null) {
//                    builder.put(fieldName, JSONUtil.toJsonStr(value));
                    if (field.getType() == String.class) {
                        map.put(fieldName, JSONObject.toJSONString(value).replaceAll("\"", ""));
                    } else {
                        map.put(fieldName, JSONObject.toJSONString(value));
                    }
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
//        return builder.build();
        return map;
    }

    /**
     * 将驼峰形式的属性名转换成全大写下划线格式
     *
     * @param fieldName
     * @return
     */
    private static String convertFieldName(String fieldName) {
        StringBuilder sb = new StringBuilder();
        for (char c : fieldName.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append('_');
                sb.append(c);
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }
}

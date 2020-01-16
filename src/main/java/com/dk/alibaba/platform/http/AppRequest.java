package com.dk.alibaba.platform.http;

import com.dk.alibaba.platform.auth.ProviderPass;
import com.google.common.collect.ImmutableMap;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.collections4.map.UnmodifiableMap;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * AppRequest
 * @Author ycx.
 */
public class AppRequest {

    /**
     * 报文头（放置系统参数）
     */
    private LinkedHashMap<String, Object> UNI_BSS_HEAD;

    /**
     * 报文体
     */
    private Map<String, Object> UNI_BSS_BODY;

    /**
     * 报文附加信息
     */
    private Map<String, Object> UNI_BSS_ATTACHED;

    /**
     * 创建一个请求
     *
     * @param providerPass
     * @param requestName
     * @param requestParam
     */
    public AppRequest(ProviderPass providerPass, String requestName, Map<String, Object> requestParam) {
        //文档这块写的是格式化后的格式
        String timeStamp = String.valueOf(System.currentTimeMillis());
        String transId = DateFormatUtils.format(new Date(), "yyyyMMddHHmmssS") +
                RandomStringUtils.randomAlphanumeric(6);
        this.UNI_BSS_HEAD = new LinkedHashMap<>();
        this.UNI_BSS_HEAD.put("APP_ID", providerPass.getAppId());
        this.UNI_BSS_HEAD.put("TIMESTAMP", timeStamp);
        this.UNI_BSS_HEAD.put("TRANS_ID", transId);

        String paramsStr = this.UNI_BSS_HEAD.keySet().stream().map(key -> key + this.UNI_BSS_HEAD.get(key))
                .collect(Collectors.joining()).concat(providerPass.getAppSecret());
        //MD5
        String token = DigestUtils.md5Hex(paramsStr).toLowerCase();
        this.UNI_BSS_HEAD.put("TOKEN", token);

        /*requestParam.put("APP_ID", providerPass.getAppId());
        requestParam.put("TIMESTAMP", timeStamp);
        requestParam.put("TOKEN", token);*/

        this.UNI_BSS_BODY = new HashMap<>();
        this.UNI_BSS_BODY.put(requestName, requestParam);

        this.UNI_BSS_ATTACHED = new HashMap<>();
    }

    /**
     * 获取请求头
     *
     * @return
     */
    public Map<String, Object> getUNI_BSS_HEAD() {
        return UnmodifiableMap.unmodifiableMap(this.UNI_BSS_HEAD);
    }

    public Map<String, Object> getUNI_BSS_ATTACHED() {
        return UNI_BSS_ATTACHED;
    }

    public void setUNI_BSS_ATTACHED(Map<String, Object> UNI_BSS_ATTACHED) {
        this.UNI_BSS_ATTACHED = UNI_BSS_ATTACHED;
    }

    public Map<String, Object> getUNI_BSS_BODY() {
        return UNI_BSS_BODY;
    }

    public void setUNI_BSS_BODY(Map<String, Object> UNI_BSS_BODY) {
        this.UNI_BSS_BODY = UNI_BSS_BODY;
    }

    public Map<String, Object> toMap() {
        return ImmutableMap.of(
                "UNI_BSS_HEAD", UNI_BSS_HEAD,
                "UNI_BSS_BODY", UNI_BSS_BODY,
                "UNI_BSS_ATTACHED", UNI_BSS_ATTACHED
        );
    }
}

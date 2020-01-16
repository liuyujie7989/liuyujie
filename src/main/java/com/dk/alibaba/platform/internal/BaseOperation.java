package com.dk.alibaba.platform.internal;

import com.dk.alibaba.platform.auth.ProviderPass;
import com.dk.alibaba.platform.http.HttpClientWrapper;
import com.dk.alibaba.platform.parser.ResponseParseException;
import com.dk.alibaba.platform.parser.ResponseParser;

import java.io.IOException;

/**
 * @author doukang
 * @description 基础操作处理类
 * @date 2019/9/24 09:47
 */
public class BaseOperation {

    protected ProviderPass providerPass;

    private HttpClientWrapper httpClientWrapper;

    protected BaseOperation(ProviderPass providerPass) {
        this.providerPass = providerPass;
        this.httpClientWrapper = HttpClientWrapper.INSTANCE;
    }

    protected <T> T doOperation(String path, String requestBody, ResponseParser<T> parser) {
        String url = providerPass.getApiHost() + path;
        String response = "";
        try {
            response = httpClientWrapper.post(url, requestBody, HttpClientWrapper.JSON_HEADERS);
            return parser.parse(response);
        } catch (IOException e) {
            throw new RuntimeException("请求发送失败：", e);
        } catch (ResponseParseException e) {
            throw new RuntimeException("请求结果解析失败：", e);
        }
    }
}

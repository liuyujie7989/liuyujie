package com.dk.alibaba.platform.auth;

/**
 * @author doukang
 * @description 服务通行证
 * @date 2019/5/10 17:56
 */
public class ProviderPass {

    private String appId;     // "hBX8oElHuN";

    private String appSecret; // "8zuKKp9pyfCn3Rh6iq0NbT8iqpmHt8DY";

    private String apiHost;   // "http://117.39.29.95:8206/OSN/api";

    public ProviderPass(String appId, String appSecret, String apiHost) {
        this.appId = appId;
        this.appSecret = appSecret;
        this.apiHost = apiHost;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getApiHost() {
        return apiHost;
    }

    public void setApiHost(String apiHost) {
        this.apiHost = apiHost;
    }
}

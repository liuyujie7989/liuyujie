package com.dk.alibaba.platform.model.req;

/**
 * @author doukang
 * @description 获取后台用户信息接口入参
 * @date 2019/11/4 18:05
 */
public class SelectUserInfoReq {

    /**
     * 用户id
     */
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}

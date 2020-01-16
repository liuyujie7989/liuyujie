package com.dk.alibaba.platform.model.req;

/**
 * @author doukang
 * @description 获取前台用户详细信息接口入参
 * @date 2019/11/4 18:06
 */
public class SelectCustomerDetailsByIdReq {

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

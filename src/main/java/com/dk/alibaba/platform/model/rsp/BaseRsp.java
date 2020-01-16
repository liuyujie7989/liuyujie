package com.dk.alibaba.platform.model.rsp;

import java.io.Serializable;

/**
 * @author doukang
 * @description 返回结果公共字段
 * @date 2019/10/8 15:01
 */
public class BaseRsp implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 返回值 0成功 1失败
     */
    private String code;

    /**
     * 返回描述
     */
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

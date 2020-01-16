package com.dk.alibaba.platform.model.rsp;

import java.io.Serializable;

/**
 * @author doukang
 * @description 返回结果公共字段
 * @date 2019/11/4 18:40
 */
public class BaseRsp2 implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 返回值(0000、00000成功)
     */
    private String respCode;

    /**
     * 返回描述
     */
    private String respDesc;

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespDesc() {
        return respDesc;
    }

    public void setRespDesc(String respDesc) {
        this.respDesc = respDesc;
    }
}

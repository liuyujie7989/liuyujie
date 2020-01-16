package com.dk.alibaba.platform.model.rsp;

import com.dk.alibaba.platform.model.bo.CustomerInfoInformationBO;
import com.dk.alibaba.platform.model.bo.CustomerInfoLegalBO;
import com.dk.alibaba.platform.model.bo.CustomerInfoPersonBO;

/**
 * @author doukang
 * @description 查询前台用户详细信息接口出参
 * @date 2019/11/4 18:27
 */
public class SelectCustomerDetailsByIdRsp extends BaseRsp {

    /**
     * 账号信息
     */
    private CustomerInfoInformationBO infoInformation;

    /**
     * 自然人信息
     */
    private CustomerInfoPersonBO infoPerson;

    /**
     * 法人信息
     */
    private CustomerInfoLegalBO infoLegal;

    public CustomerInfoInformationBO getInfoInformation() {
        return infoInformation;
    }

    public void setInfoInformation(CustomerInfoInformationBO infoInformation) {
        this.infoInformation = infoInformation;
    }

    public CustomerInfoPersonBO getInfoPerson() {
        return infoPerson;
    }

    public void setInfoPerson(CustomerInfoPersonBO infoPerson) {
        this.infoPerson = infoPerson;
    }

    public CustomerInfoLegalBO getInfoLegal() {
        return infoLegal;
    }

    public void setInfoLegal(CustomerInfoLegalBO infoLegal) {
        this.infoLegal = infoLegal;
    }
}

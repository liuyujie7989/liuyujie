package com.dk.alibaba.platform.model.bo;

/**
 * @author doukang
 * @description 用户账号信息
 * @date 2019/11/4 18:34
 */
public class CustomerInfoInformationBO {

    /**
     * 用户id
     */
    private String userId;

    /**
     * 登录名
     */
    private String loginName;

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机号
     */
    private String cellPhone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 注册类型：register:personal 个人 register:company 企业
     */
    private String registerType;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegisterType() {
        return registerType;
    }

    public void setRegisterType(String registerType) {
        this.registerType = registerType;
    }
}

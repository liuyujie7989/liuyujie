package com.dk.alibaba.platform.model.rsp;

/**
 * @author doukang
 * @description 查询后台用户信息接口出参
 * @date 2019/11/4 18:27
 */
public class SelectUserInfoRsp extends BaseRsp {

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
     * 后台用户类型（0系统管理员 1全局管理 2租户管理 3普通用户）
     */
    private String type;

    /**
     * 手机号
     */
    private String cellPhone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 管理组织机构编码
     */
    private String mOrgId;

    /**
     * 所属组织机构编码
     */
    private String orgId;

    /**
     * 状态
     */
    private String status;

    /**
     * 所属机构名称
     */
    private String orgName;

    /**
     * 注册类型（register:personal 个人; register:company企业）
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getmOrgId() {
        return mOrgId;
    }

    public void setmOrgId(String mOrgId) {
        this.mOrgId = mOrgId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getRegisterType() {
        return registerType;
    }

    public void setRegisterType(String registerType) {
        this.registerType = registerType;
    }
}

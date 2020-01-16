package com.dk.alibaba.platform.model.bo;

/**
 * @author doukang
 * @description 法人信息
 * @date 2019/11/4 18:34
 */
public class CustomerInfoLegalBO {

    /**
     * 法人编号
     */
    private String customerNo;

    /**
     * 用户姓名
     */
    private String customerName;

    /**
     * 实名认证登记
     */
    private String caLevel;

    /**
     * 企业住所/经营地址
     */
    private String enterpriseAddress;

    /**
     * 经营范围
     */
    private String busiArrange;

    /**
     * 许可经营项目
     */
    private String busiProject;

    /**
     * 企业类型代码
     */
    private String enterpriseTypeNo;

    /**
     * 企业类型名称
     */
    private String enterpriseTypeName;

    /**
     * 成立日期（注册日期）
     */
    private String registeredDate;

    /**
     * 营业期限起
     */
    private String termBeginDate;

    /**
     * 营业期限止
     */
    private String termEndDate;

    /**
     * 核准日期
     */
    private String approvalDate;

    /**
     * 登记机关
     */
    private String registeredAuthority;

    /**
     * 企业联系电话
     */
    private String linkPhone;

    /**
     * 住所地址
     */
    private String domicileAddress;

    /**
     * 住所所在行政区划
     */
    private String domicileEdifactArea;

    /**
     * 生产经营地所在行政区划
     */
    private String busiEdifactArea;

    /**
     * 邮政编码
     */
    private String enterprisePost;

    /**
     * 企业邮箱
     */
    private String enterpriseEmail;

    /**
     * 组成形式
     */
    private String orgType;

    /**
     * 企业信用信息公示系统网址
     */
    private String enterpriseHomepage;

    /**
     * 备注
     */
    private String remark;

    /**
     * 企业编码
     */
    private String licenseNo;

    /**
     * 法人单位名称
     */
    private String enterpriseName;

    /**
     * 法人证件类型
     */
    private String legalIdType;

    /**
     * 法人证件号
     */
    private String legalIdNumber;

    /**
     * 法人代表名称
     */
    private String legalName;

    /**
     * 法人性别
     */
    private String legalSex;

    /**
     * 法人民族
     */
    private String legalNation;

    /**
     * 法人类型
     */
    private String legalType;

    /**
     * 单位登记所在地
     */
    private String areaId;

    /**
     * 机构状态
     */
    private String enterpriseStatus;

    /**
     * 创建时间
     */
    private String createDate;

    /**
     * 失效时间
     */
    private String expDate;

    /**
     * 法人类型/机构类型说明
     */
    private String legalTypeName;

    /**
     * 法人证件类型说明
     */
    private String legalIdTypeName;

    /**
     * 法人代表名称/负责人
     */
    private String enterpriseCorporate;

    /**
     * 状态：0生效 1无效
     */
    private String flag;

    /**
     * 认证标示：0/空 未认证 1 已认证
     */
    private String identificationFlag;

    /**
     * 行业类型编码
     */
    private String industryTypeNo;

    /**
     * 行业类型名称
     */
    private String industryTypeName;

    /**
     * 行业小类编码
     */
    private String subIndustryTypeNo;

    /**
     * 行业小类名称
     */
    private String subIndustryTypeName;

    /**
     * 用户有效标示：0有效 1无效
     */
    private String status;

    /**
     * 联系人号码
     */
    private String telePhone;

    /**
     * 注册资本
     */
    private String registeredCapital;

    /**
     * 实收资本
     */
    private String paidupCapital;

    /**
     * 核名通知书号
     */
    private String notificationNo;

    /**
     * 用户类型：1自然人 2法人
     */
    private String customerType;

    /**
     * 经营期限
     */
    private String operatingPeriod;

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCaLevel() {
        return caLevel;
    }

    public void setCaLevel(String caLevel) {
        this.caLevel = caLevel;
    }

    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress;
    }

    public String getBusiArrange() {
        return busiArrange;
    }

    public void setBusiArrange(String busiArrange) {
        this.busiArrange = busiArrange;
    }

    public String getBusiProject() {
        return busiProject;
    }

    public void setBusiProject(String busiProject) {
        this.busiProject = busiProject;
    }

    public String getEnterpriseTypeNo() {
        return enterpriseTypeNo;
    }

    public void setEnterpriseTypeNo(String enterpriseTypeNo) {
        this.enterpriseTypeNo = enterpriseTypeNo;
    }

    public String getEnterpriseTypeName() {
        return enterpriseTypeName;
    }

    public void setEnterpriseTypeName(String enterpriseTypeName) {
        this.enterpriseTypeName = enterpriseTypeName;
    }

    public String getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(String registeredDate) {
        this.registeredDate = registeredDate;
    }

    public String getTermBeginDate() {
        return termBeginDate;
    }

    public void setTermBeginDate(String termBeginDate) {
        this.termBeginDate = termBeginDate;
    }

    public String getTermEndDate() {
        return termEndDate;
    }

    public void setTermEndDate(String termEndDate) {
        this.termEndDate = termEndDate;
    }

    public String getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(String approvalDate) {
        this.approvalDate = approvalDate;
    }

    public String getRegisteredAuthority() {
        return registeredAuthority;
    }

    public void setRegisteredAuthority(String registeredAuthority) {
        this.registeredAuthority = registeredAuthority;
    }

    public String getLinkPhone() {
        return linkPhone;
    }

    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone;
    }

    public String getDomicileAddress() {
        return domicileAddress;
    }

    public void setDomicileAddress(String domicileAddress) {
        this.domicileAddress = domicileAddress;
    }

    public String getDomicileEdifactArea() {
        return domicileEdifactArea;
    }

    public void setDomicileEdifactArea(String domicileEdifactArea) {
        this.domicileEdifactArea = domicileEdifactArea;
    }

    public String getBusiEdifactArea() {
        return busiEdifactArea;
    }

    public void setBusiEdifactArea(String busiEdifactArea) {
        this.busiEdifactArea = busiEdifactArea;
    }

    public String getEnterprisePost() {
        return enterprisePost;
    }

    public void setEnterprisePost(String enterprisePost) {
        this.enterprisePost = enterprisePost;
    }

    public String getEnterpriseEmail() {
        return enterpriseEmail;
    }

    public void setEnterpriseEmail(String enterpriseEmail) {
        this.enterpriseEmail = enterpriseEmail;
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    public String getEnterpriseHomepage() {
        return enterpriseHomepage;
    }

    public void setEnterpriseHomepage(String enterpriseHomepage) {
        this.enterpriseHomepage = enterpriseHomepage;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getLegalIdType() {
        return legalIdType;
    }

    public void setLegalIdType(String legalIdType) {
        this.legalIdType = legalIdType;
    }

    public String getLegalIdNumber() {
        return legalIdNumber;
    }

    public void setLegalIdNumber(String legalIdNumber) {
        this.legalIdNumber = legalIdNumber;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getLegalSex() {
        return legalSex;
    }

    public void setLegalSex(String legalSex) {
        this.legalSex = legalSex;
    }

    public String getLegalNation() {
        return legalNation;
    }

    public void setLegalNation(String legalNation) {
        this.legalNation = legalNation;
    }

    public String getLegalType() {
        return legalType;
    }

    public void setLegalType(String legalType) {
        this.legalType = legalType;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getEnterpriseStatus() {
        return enterpriseStatus;
    }

    public void setEnterpriseStatus(String enterpriseStatus) {
        this.enterpriseStatus = enterpriseStatus;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getLegalTypeName() {
        return legalTypeName;
    }

    public void setLegalTypeName(String legalTypeName) {
        this.legalTypeName = legalTypeName;
    }

    public String getLegalIdTypeName() {
        return legalIdTypeName;
    }

    public void setLegalIdTypeName(String legalIdTypeName) {
        this.legalIdTypeName = legalIdTypeName;
    }

    public String getEnterpriseCorporate() {
        return enterpriseCorporate;
    }

    public void setEnterpriseCorporate(String enterpriseCorporate) {
        this.enterpriseCorporate = enterpriseCorporate;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getIdentificationFlag() {
        return identificationFlag;
    }

    public void setIdentificationFlag(String identificationFlag) {
        this.identificationFlag = identificationFlag;
    }

    public String getIndustryTypeNo() {
        return industryTypeNo;
    }

    public void setIndustryTypeNo(String industryTypeNo) {
        this.industryTypeNo = industryTypeNo;
    }

    public String getIndustryTypeName() {
        return industryTypeName;
    }

    public void setIndustryTypeName(String industryTypeName) {
        this.industryTypeName = industryTypeName;
    }

    public String getSubIndustryTypeNo() {
        return subIndustryTypeNo;
    }

    public void setSubIndustryTypeNo(String subIndustryTypeNo) {
        this.subIndustryTypeNo = subIndustryTypeNo;
    }

    public String getSubIndustryTypeName() {
        return subIndustryTypeName;
    }

    public void setSubIndustryTypeName(String subIndustryTypeName) {
        this.subIndustryTypeName = subIndustryTypeName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTelePhone() {
        return telePhone;
    }

    public void setTelePhone(String telePhone) {
        this.telePhone = telePhone;
    }

    public String getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public String getPaidupCapital() {
        return paidupCapital;
    }

    public void setPaidupCapital(String paidupCapital) {
        this.paidupCapital = paidupCapital;
    }

    public String getNotificationNo() {
        return notificationNo;
    }

    public void setNotificationNo(String notificationNo) {
        this.notificationNo = notificationNo;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getOperatingPeriod() {
        return operatingPeriod;
    }

    public void setOperatingPeriod(String operatingPeriod) {
        this.operatingPeriod = operatingPeriod;
    }
}

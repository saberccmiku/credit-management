package com.saber.credit.entities;

/**
 * Created by saber on 2019/6/10
 * 信贷产品
 */
public class Product extends BaseBean{

    private String name;
    private String logo;
    private String introduction;
    private String cooperation;
    private String settlementCycle;
    private Double price;
    private Double creditRate;
    private String creditRateUnit;
    private Double amountMax;
    private Double amountMin;
    private String creditCycle;
    private Double auditDuration;
    private String auditDurationUnit;
    private Double paySpeed;
    private String paySpeedUnit;
    private String links;
    private String account;
    private String repayment;
    private Integer registerCount;
    private Double innerTimeMin;
    private Double innerTimeMax;
    private String application;
    private String creditMaterial;
    private String creditInfo;
    private String review;
    private String prePayment;
    private String verify;
    private String businessName;
    private String contact;
    private String contactPhone;
    private String contactWeChat;
    private String isShow;

    //流量信息
    private Integer readCount;
    private Integer clickCount;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getCooperation() {
        return cooperation;
    }

    public void setCooperation(String cooperation) {
        this.cooperation = cooperation;
    }

    public String getSettlementCycle() {
        return settlementCycle;
    }

    public void setSettlementCycle(String settlementCycle) {
        this.settlementCycle = settlementCycle;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getCreditRate() {
        return creditRate;
    }

    public void setCreditRate(Double creditRate) {
        this.creditRate = creditRate;
    }

    public Double getAmountMax() {
        return amountMax;
    }

    public void setAmountMax(Double amountMax) {
        this.amountMax = amountMax;
    }

    public Double getAmountMin() {
        return amountMin;
    }

    public void setAmountMin(Double amountMin) {
        this.amountMin = amountMin;
    }

    public String getCreditCycle() {
        return creditCycle;
    }

    public void setCreditCycle(String creditCycle) {
        this.creditCycle = creditCycle;
    }

    public Double getAuditDuration() {
        return auditDuration;
    }

    public void setAuditDuration(Double auditDuration) {
        this.auditDuration = auditDuration;
    }

    public Double getPaySpeed() {
        return paySpeed;
    }

    public void setPaySpeed(Double paySpeed) {
        this.paySpeed = paySpeed;
    }

    public String getLinks() {
        return links;
    }

    public void setLinks(String links) {
        this.links = links;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getRepayment() {
        return repayment;
    }

    public void setRepayment(String repayment) {
        this.repayment = repayment;
    }

    public Integer getRegisterCount() {
        return registerCount;
    }

    public void setRegisterCount(Integer registerCount) {
        this.registerCount = registerCount;
    }


    public Double getInnerTimeMin() {
        return innerTimeMin;
    }

    public void setInnerTimeMin(Double innerTimeMin) {
        this.innerTimeMin = innerTimeMin;
    }

    public Double getInnerTimeMax() {
        return innerTimeMax;
    }

    public void setInnerTimeMax(Double innerTimeMax) {
        this.innerTimeMax = innerTimeMax;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getCreditMaterial() {
        return creditMaterial;
    }

    public void setCreditMaterial(String creditMaterial) {
        this.creditMaterial = creditMaterial;
    }

    public String getCreditInfo() {
        return creditInfo;
    }

    public void setCreditInfo(String creditInfo) {
        this.creditInfo = creditInfo;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getPrePayment() {
        return prePayment;
    }

    public void setPrePayment(String prePayment) {
        this.prePayment = prePayment;
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }


    public String getIsShow() {
        return isShow;
    }

    public void setIsShow(String isShow) {
        this.isShow = isShow;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactWeChat() {
        return contactWeChat;
    }

    public void setContactWeChat(String contactWeChat) {
        this.contactWeChat = contactWeChat;
    }

    public String getAuditDurationUnit() {
        return auditDurationUnit;
    }

    public void setAuditDurationUnit(String auditDurationUnit) {
        this.auditDurationUnit = auditDurationUnit;
    }

    public String getPaySpeedUnit() {
        return paySpeedUnit;
    }

    public void setPaySpeedUnit(String paySpeedUnit) {
        this.paySpeedUnit = paySpeedUnit;
    }

    public String getCreditRateUnit() {
        return creditRateUnit;
    }

    public void setCreditRateUnit(String creditRateUnit) {
        this.creditRateUnit = creditRateUnit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", logo='" + logo + '\'' +
                ", introduction='" + introduction + '\'' +
                ", cooperation='" + cooperation + '\'' +
                ", settlementCycle='" + settlementCycle + '\'' +
                ", price=" + price +
                ", creditRate=" + creditRate +
                ", creditRateUnit='" + creditRateUnit + '\'' +
                ", amountMax=" + amountMax +
                ", amountMin=" + amountMin +
                ", creditCycle='" + creditCycle + '\'' +
                ", auditDuration=" + auditDuration +
                ", auditDurationUnit='" + auditDurationUnit + '\'' +
                ", paySpeed=" + paySpeed +
                ", paySpeedUnit='" + paySpeedUnit + '\'' +
                ", links='" + links + '\'' +
                ", user='" + account + '\'' +
                ", repayment='" + repayment + '\'' +
                ", registerCount=" + registerCount +
                ", innerTimeMin=" + innerTimeMin +
                ", innerTimeMax=" + innerTimeMax +
                ", application='" + application + '\'' +
                ", creditMaterial='" + creditMaterial + '\'' +
                ", creditInfo='" + creditInfo + '\'' +
                ", review='" + review + '\'' +
                ", prePayment='" + prePayment + '\'' +
                ", verify='" + verify + '\'' +
                ", businessName='" + businessName + '\'' +
                ", contact='" + contact + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", contactWeChat='" + contactWeChat + '\'' +
                ", isShow='" + isShow + '\'' +
                ", readCount=" + readCount +
                ", clickCount=" + clickCount +
                '}';
    }
}

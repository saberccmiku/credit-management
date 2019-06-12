package com.saber.credit.entities;

import java.util.Date;

/**
 * Created by saber on 2019/6/10
 * 信贷产品
 */
public class Product {

    private String id;
    private String createUser;
    private Date createDate;
    private String lastChangeUser;
    private Date lastChangeDate;
    private String delFlag;
    private String name;
    private String logo;
    private String introduction;
    private String cooperation;
    private String settlementCycle;
    private Double price;
    private Double creditRate;
    private Double amountMax;
    private Double amountMin;
    private String creditCycle;
    private Double auditDuration;
    private Double paySpeed;
    private String links;
    private String account;
    private String repayment;
    private Integer registerCount;
    private String innerTime;
    private String application;
    private String creditMaterial;
    private String creditInfo;
    private String review;
    private Double prePayment;
    private String verify;
    private String businessName;
    private String contact;
    //流量信息
    private Integer readCount;
    private Integer clickCount;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getLastChangeUser() {
        return lastChangeUser;
    }

    public void setLastChangeUser(String lastChangeUser) {
        this.lastChangeUser = lastChangeUser;
    }

    public Date getLastChangeDate() {
        return lastChangeDate;
    }

    public void setLastChangeDate(Date lastChangeDate) {
        this.lastChangeDate = lastChangeDate;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

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

    public String getInnerTime() {
        return innerTime;
    }

    public void setInnerTime(String innerTime) {
        this.innerTime = innerTime;
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

    public Double getPrePayment() {
        return prePayment;
    }

    public void setPrePayment(Double prePayment) {
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

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", createUser='" + createUser + '\'' +
                ", createDate=" + createDate +
                ", lastChangeUser='" + lastChangeUser + '\'' +
                ", lastChangeDate=" + lastChangeDate +
                ", delFlag='" + delFlag + '\'' +
                ", name='" + name + '\'' +
                ", logo='" + logo + '\'' +
                ", introduction='" + introduction + '\'' +
                ", cooperation='" + cooperation + '\'' +
                ", settlementCycle='" + settlementCycle + '\'' +
                ", price=" + price +
                ", creditRate=" + creditRate +
                ", amountMax=" + amountMax +
                ", amountMin=" + amountMin +
                ", creditCycle='" + creditCycle + '\'' +
                ", auditDuration=" + auditDuration +
                ", paySpeed=" + paySpeed +
                ", links='" + links + '\'' +
                ", account='" + account + '\'' +
                ", repayment='" + repayment + '\'' +
                ", registerCount=" + registerCount +
                ", innerTime='" + innerTime + '\'' +
                ", application='" + application + '\'' +
                ", creditMaterial='" + creditMaterial + '\'' +
                ", creditInfo='" + creditInfo + '\'' +
                ", review='" + review + '\'' +
                ", prePayment=" + prePayment +
                ", verify='" + verify + '\'' +
                ", businessName='" + businessName + '\'' +
                ", contact='" + contact + '\'' +
                ", readCount=" + readCount +
                ", clickCount=" + clickCount +
                '}';
    }
}

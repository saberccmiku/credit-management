package com.saber.credit.entities;

import java.util.Date;

/**
 * Created by saber on 2019/6/14.
 * 基础类
 */
public class BaseBean {

    private String id;
    private String createUser;
    private Date createDate;
    private String lastChangeUser;
    private Date lastChangeDate;
    private String delFlag;

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

    @Override
    public String toString() {
        return "BaseBean{" +
                "id='" + id + '\'' +
                ", createUser='" + createUser + '\'' +
                ", createDate=" + createDate +
                ", lastChangeUser='" + lastChangeUser + '\'' +
                ", lastChangeDate=" + lastChangeDate +
                ", delFlag='" + delFlag + '\'' +
                '}';
    }
}

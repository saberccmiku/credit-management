package com.saber.credit.entities;

/**
 * Created by saber on 2019/6/12
 * 枚举类的子类
 */
public class EnumerateItem  extends BaseBean{

    private String code;
    private String parentCode;
    private String value;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "EnumerateItem{" +
                "code='" + code + '\'' +
                ", parentCode='" + parentCode + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}

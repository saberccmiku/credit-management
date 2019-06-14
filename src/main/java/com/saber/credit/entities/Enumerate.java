package com.saber.credit.entities;

import java.util.List;

/**
 * Created by saber on 2019/6/12.
 * 枚举类
 */
public class Enumerate extends BaseBean {

    private String code;
    private String parentCode;
    private String value;
    List<EnumerateItem> itemList;

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

    public List<EnumerateItem> getItemList() {
        return itemList;
    }

    public void setItemList(List<EnumerateItem> itemList) {
        this.itemList = itemList;
    }

    @Override
    public String toString() {
        return "Enumerate{" +
                "code='" + code + '\'' +
                ", parentCode='" + parentCode + '\'' +
                ", value='" + value + '\'' +
                ", itemList=" + itemList +
                '}';
    }
}

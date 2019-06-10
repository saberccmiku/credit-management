package com.saber.credit.entities;

import java.util.Date;

/**
 * Created by saber on 2019/6/10
 * 信贷产品
 */
public class Product {

    private String id;
    private String name;
    private Date readDate;
    private int readCount;
    private int clickCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getReadDate() {
        return readDate;
    }

    public void setReadDate(Date readDate) {
        this.readDate = readDate;
    }

    public int getReadCount() {
        return readCount;
    }

    public void setReadCount(int readCount) {
        this.readCount = readCount;
    }

    public int getClickCount() {
        return clickCount;
    }

    public void setClickCount(int clickCount) {
        this.clickCount = clickCount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", readDate=" + readDate +
                ", readCount=" + readCount +
                ", clickCount=" + clickCount +
                '}';
    }
}

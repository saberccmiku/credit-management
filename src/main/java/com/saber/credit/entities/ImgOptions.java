package com.saber.credit.entities;

/**
 * Created by saber on 2019/7/1
 */
public class ImgOptions {

    private String code;
    private String name;
    private double width;
    private double height;
    private double size;
    private String url;


    public ImgOptions() {
    }

    public ImgOptions(String code,String name, double width, double height, double size, String url) {
        this.code = code;
        this.name = name;
        this.width = width;
        this.height = height;
        this.size = size;
        this.url = url;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}

package com.saber.credit.entities;

import java.util.List;

/**
 * Created by saber on 2019/6/4
 * 菜单栏目
 */
public class Menu {

    private String id;
    private String title;
    private String icoUrl;
    private String sort;
    private String url;
    private String delFlag;
    private String pId;

    private List<Menu> sonMenuList;

    public Menu() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcoUrl() {
        return icoUrl;
    }

    public void setIcoUrl(String icoUrl) {
        this.icoUrl = icoUrl;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public List<Menu> getSonMenuList() {
        return sonMenuList;
    }

    public void setSonMenuList(List<Menu> sonMenuList) {
        this.sonMenuList = sonMenuList;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", icoUrl='" + icoUrl + '\'' +
                ", sort='" + sort + '\'' +
                ", url='" + url + '\'' +
                ", delFlag='" + delFlag + '\'' +
                ", sonMenuList=" + sonMenuList +
                '}';
    }
}

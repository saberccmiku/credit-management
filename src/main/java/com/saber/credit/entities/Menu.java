package com.saber.credit.entities;

import java.util.List;

/**
 * Created by saber on 2019/6/4
 * 菜单栏目
 */
public class Menu extends BaseBean {

    private String title;
    private String icoUrl;
    private String sort;
    private String url;
    private String delFlag;
    private String pId;

    public Menu() {
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

    public String getPid() {
        return pId;
    }

    public void setPid(String pId) {
        this.pId = pId;
    }


    @Override
    public String toString() {
        return "Menu{" +
                "title='" + title + '\'' +
                ", icoUrl='" + icoUrl + '\'' +
                ", sort='" + sort + '\'' +
                ", url='" + url + '\'' +
                ", delFlag='" + delFlag + '\'' +
                ", pId=" + pId +
                '}';
    }
}

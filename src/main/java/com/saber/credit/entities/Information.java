package com.saber.credit.entities;

/**
 * Created by Administrator on 2019/6/16
 * 公告
 */
public class Information extends BaseBean {

    private String title;
    private String type;
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

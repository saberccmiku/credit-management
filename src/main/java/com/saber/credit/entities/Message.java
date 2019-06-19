package com.saber.credit.entities;

/**
 * Created by saber on 2019/6/19.
 * 通知消息
 */
public class Message extends BaseBean {

    private String title;
    private String sendType;
    private String messageType;
    private String content;
    private String jumpType;
    private String sendTime;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSendType() {
        return sendType;
    }

    public void setSendType(String sendType) {
        this.sendType = sendType;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getJumpType() {
        return jumpType;
    }

    public void setJumpType(String jumpType) {
        this.jumpType = jumpType;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }
}

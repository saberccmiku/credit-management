package com.saber.credit.entities;

import java.io.Serializable;

/**
 * Created by saber on 2019/7/9.
 * 操作信息体
 */
public class ResponseResult implements Serializable {

    private static final long serialVersionUID = 5318241442781137394L;


    private String message;
    private Object data;
    private int code;
    private boolean success;
    private Long total;

    public ResponseResult(){}

    public ResponseResult(boolean success, Object data) {
        this.success = success;
        this.data = data;
    }

    public ResponseResult(boolean success, String message, Object data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public ResponseResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public ResponseResult setData(Object data) {
        this.data = data;
        return this;
    }

    public boolean getSuccess() {
        return success;
    }

    public ResponseResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public int getCode() {
        return code;
    }

    public ResponseResult setCode(int code) {
        this.code = code;
        return this;
    }

    public Long getTotal() {
        return total;
    }

    public ResponseResult setTotal(Long total) {
        this.total = total;
        return this;
    }
}

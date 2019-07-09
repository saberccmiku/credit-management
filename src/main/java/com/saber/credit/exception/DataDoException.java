package com.saber.credit.exception;

/**
 * Created by saber on 2019/7/9.
 * 操作数据或库出现异常
 */
public class DataDoException extends RuntimeException {

    private static final long serialVersionUID = 5667723496316233524L;

    public DataDoException(String msg){
        super(msg);
    }
}

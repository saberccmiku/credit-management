package com.saber.credit.exception;

/**
 * Created by saber on 2019/7/9.
 * 业务层需要自己声明异常的情况
 */
public class ServiceException extends RuntimeException {

    private static final long serialVersionUID = 1738572008617453672L;

    public ServiceException (String msg){
        super(msg);
    }
}

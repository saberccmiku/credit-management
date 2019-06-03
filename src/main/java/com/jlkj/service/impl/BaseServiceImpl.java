package com.jlkj.service.impl;

import com.jlkj.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by saber on 2019/6/3
 */
public class BaseServiceImpl<T> extends BaseService<T> {

    @Autowired
    BaseService<T> baseService;

    public List<T> query(){
        return baseService.query();
    }

    public T queryById(){
        return baseService.queryById();
    }

}

package com.jlkj.service;

import com.jlkj.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by saber on 2019/6/3
 */
public interface BaseService<T> extends BaseMapper<T>{

    public List<T> query();

    public T queryById();
}

package com.jlkj.service.Impl;

import com.jlkj.mapper.BaseMapper;
import com.jlkj.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2019/6/3
 */
public class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    BaseMapper<T> baseMapper;

    @Override
    public List<T> query() {
        return baseMapper.query();
    }

    @Override
    public T queryById() {
        return baseMapper.queryById();
    }
}

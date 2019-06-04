package com.saber.credit.service.impl;

import com.saber.credit.mapper.BaseMapper;
import com.saber.credit.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2019/6/4
 */
public class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    private BaseMapper<T> baseMapper;

    @Override
    public List<T> query() {
        return baseMapper.query();
    }

    @Override
    public T queryById() {
        return baseMapper.queryById();
    }

    @Override
    public void deleteById() {
        baseMapper.deleteById();
    }

    @Override
    public void updateById() {
        baseMapper.updateById();
    }
}

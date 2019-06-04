package com.saber.credit.service;

import com.saber.credit.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by saber on 2019/6/3
 */
public class BaseService<T> {

    @Autowired
    private BaseMapper<T> baseMapper;

    public void setBaseMapper(BaseMapper<T> baseMapper){
        this.baseMapper =baseMapper;
    }

    public List<T> query() {
        return baseMapper.query();
    }

    public T queryById() {
        return baseMapper.queryById();
    }

    public void deleteById() {
        baseMapper.deleteById();
    }

    public void updateById() {
        baseMapper.updateById();
    }
}

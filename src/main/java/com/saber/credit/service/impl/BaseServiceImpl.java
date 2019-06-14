package com.saber.credit.service.impl;

import com.saber.credit.entities.BaseBean;
import com.saber.credit.entities.User;
import com.saber.credit.mapper.BaseMapper;
import com.saber.credit.service.BaseService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2019/6/4
 */
public class BaseServiceImpl<T extends BaseBean> implements BaseService<T> {

    @Autowired
    private BaseMapper<T> baseMapper;
    @Autowired
    private HttpSession session;

    @Override
    public List<T> query() {
        return baseMapper.query();
    }

    @Override
    public List<T> query(Integer page, Integer limit) {
        return baseMapper.query(page,limit);
    }

    @Override
    public T queryById(String id) {
        return baseMapper.queryById(id);
    }

    @Override
    public void deleteById(String id) {
        baseMapper.deleteById(id);
    }

    @Override
    public void updateById(String id) {
        baseMapper.updateById(id);
    }

    @Override
    public void insert(T t) {
        User loginUser = (User) session.getAttribute("loginUser");
        t.setCreateUser(loginUser.getId());
        t.setCreateDate(new Date());
        baseMapper.insert(t);
    }
}

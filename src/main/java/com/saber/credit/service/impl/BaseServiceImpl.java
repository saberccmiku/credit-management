package com.saber.credit.service.impl;

import com.saber.credit.entities.BaseBean;
import com.saber.credit.entities.User;
import com.saber.credit.mapper.BaseMapper;
import com.saber.credit.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

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
    public List<T> query(T t) {
        return baseMapper.query(t);
    }

    @Override
    public T queryById(String id) {
        return baseMapper.queryById(id);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void delete(String id) {
        baseMapper.delete(id);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void update(T t) {
        User loginUser = (User) session.getAttribute("loginUser");
        t.setLastChangeUser(loginUser.getId());
        t.setLastChangeDate(new Date());
        baseMapper.update(t);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void insert(T t) {
        User loginUser = (User) session.getAttribute("loginUser");
        t.setCreateUser(loginUser.getId());
        t.setCreateDate(new Date());
        baseMapper.insert(t);
    }
}

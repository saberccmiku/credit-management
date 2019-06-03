package com.jlkj.service.impl;

import com.jlkj.bean.User;
import com.jlkj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by saber on 2019/6/3
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> {

    @Autowired
    UserService userService;

    @Override
    public List<User> query() {
        return userService.query();
    }

    @Override
    public User queryById() {
        return userService.queryById();
    }
}

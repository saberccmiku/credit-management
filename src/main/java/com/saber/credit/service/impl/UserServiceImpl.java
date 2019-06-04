package com.saber.credit.service.impl;

import com.saber.credit.entities.User;
import com.saber.credit.mapper.UserMapper;
import com.saber.credit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/6/4
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryByUserIdOrPhone(String userId) {
        return userMapper.queryByUserIdOrPhone(userId);
    }
}

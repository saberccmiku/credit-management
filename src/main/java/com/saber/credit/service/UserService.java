package com.saber.credit.service;

import com.saber.credit.entities.User;
import com.saber.credit.mapper.UserMapper;
import com.sun.tracing.dtrace.Attributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by saber on 2019/6/3
 */
@Service
public class UserService extends BaseService<User> {

    @Autowired
    private UserMapper userMapper;

    public User queryByUserIdOrPhone(String userId){
        return userMapper.queryByUserIdOrPhone(userId);
    }
}

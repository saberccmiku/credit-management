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
public interface UserService extends BaseService<User> {

    /**
     * 根据登录账号获取用户信息，userId可为用户id或者手机号码
     * @param userId 登录账号
     * @return User
     */
     User queryByUserIdOrPhone(String userId);
}

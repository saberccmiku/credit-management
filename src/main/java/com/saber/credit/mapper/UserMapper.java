package com.saber.credit.mapper;

import com.saber.credit.entities.User;
import org.springframework.stereotype.Repository;

/**
 * Created by saber on 2019/6/3
 */
@Repository
public interface UserMapper extends BaseMapper<User>{

    /**
     * 根据登录账号获取用户信息，userId可为用户id或者手机号码
     * @param userId 登录账号
     * @return User
     */
    User queryByUserIdOrPhone(String userId);
}

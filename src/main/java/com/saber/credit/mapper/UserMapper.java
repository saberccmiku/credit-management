package com.saber.credit.mapper;

import com.saber.credit.entities.Goods;
import com.saber.credit.entities.User;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    /**
     * 查询用户管理列表界面的用户信息
     * @return userList
     */
    List<User> queryDetail(Integer page,Integer limit);

    /**
     * 根据登录账号获查询用户浏览过的产品记录
     * @param userId 登录账号
     * @return Goods
     */
    List<Goods> queryGoodsList(String userId);
}

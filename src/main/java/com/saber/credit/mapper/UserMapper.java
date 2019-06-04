package com.saber.credit.mapper;

import com.saber.credit.entities.User;
import org.springframework.stereotype.Repository;

/**
 * Created by saber on 2019/6/3
 */
@Repository
public interface UserMapper extends BaseMapper<User>{

    User queryByUserIdOrPhone(String userId);
}

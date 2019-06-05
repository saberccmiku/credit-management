package com.saber.credit.controller;

import com.saber.credit.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Administrator on 2019/6/6
 * 用户模块
 */
@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userService;
    @GetMapping(value = "/userManager")
    public String toUserManagerPage(Integer page,Integer limit ){
        userService.query(page,limit);
        return "";
    }

}

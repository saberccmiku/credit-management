package com.saber.credit.controller;

import com.saber.credit.entities.User;
import com.saber.credit.service.UserService;
import com.saber.credit.util.MD5Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sun.security.provider.MD5;

import javax.servlet.http.HttpSession;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

/**
 * Created by saber on 2019/6/4
 * 登录
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/user/login")
    public String Login(@RequestParam("userName") String userName, @RequestParam("password") String password, Map<String, Object> map, HttpSession session) throws NoSuchAlgorithmException {
        User user = userService.queryByUserIdOrPhone(userName);
        if (user != null && user.getPassword().equals(MD5Helper.MD5Digest(password))) {
            session.setAttribute("loginUser", user.getUserId());
            return "redirect:/main";
        } else {
            map.put("msg", "账户或者密码错误");
            return "login";
        }
    }
}

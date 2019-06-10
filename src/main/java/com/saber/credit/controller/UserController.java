package com.saber.credit.controller;

import com.saber.credit.entities.Product;
import com.saber.credit.entities.User;
import com.saber.credit.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created by Administrator on 2019/6/6
 * 用户模块
 */
@Controller
public class UserController extends BaseController{

    @Autowired
    private UserServiceImpl userService;


    @GetMapping(value = "/user/list")
    public String userList(Integer page, Integer limit, Model model){
        initPage(model);
        List<User> userList = userService.queryDetail(1, 20);
        for (User user:userList) {
            List<Product> productList = userService.queryProductFlow(user.getId());
            for (Product product : productList) {
                user.setClickCount(user.getClickCount()+ product.getClickCount());
                user.setReadCount(user.getReadCount()+ product.getReadCount());
            }
        }
        model.addAttribute("users",userList);
        return "user/list";
    }

    @GetMapping(value = "/user/{id}")
    public String userDetail(@PathVariable("id") String id,Model model){
        initPage(model);
        User user = userService.queryById(id);
        List<Product> productList = userService.queryProductFlow(id);
        for (Product product : productList) {
            user.setClickCount(user.getClickCount()+ product.getClickCount());
            user.setReadCount(user.getReadCount()+ product.getReadCount());
        }
        user.setProductList(productList);
        model.addAttribute("user",user);
        return "user/detail";
    }

}

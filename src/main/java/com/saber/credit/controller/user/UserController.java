package com.saber.credit.controller.user;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.saber.credit.controller.BaseController;
import com.saber.credit.entities.Product;
import com.saber.credit.entities.User;
import com.saber.credit.service.impl.UserServiceImpl;
import com.saber.credit.util.MD5Helper;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/6
 * 用户模块
 */
@Controller
public class UserController extends BaseController {

    @Autowired
    private UserServiceImpl userService;


    @GetMapping(value = "/user/users")
    public String userList(Model model, @RequestParam(value = "page",defaultValue = "1") Integer page, @RequestParam(value = "limit",defaultValue = "10") Integer limit) {

        return loadData(model,page,limit,"user/list");
    }

    @GetMapping(value = "/user/{id}")
    public String userDetail(@PathVariable("id") String id, Model model) {
        initPage(model);
        User user = userService.queryById(id);
        List<Product> productList = userService.queryProductFlow(id);
        for (Product product : productList) {
            user.setClickCount(user.getClickCount() + product.getClickCount());
            user.setReadCount(user.getReadCount() + product.getReadCount());
        }
        user.setProductList(productList);
        model.addAttribute("user", user);
        return "user/detail";
    }

    @GetMapping(value = "/account/baseInfo")
    public String baseInfo(Model model, HttpSession session) {
        initPage(model);
        User loginUser = (User) session.getAttribute("loginUser");
        model.addAttribute("user", loginUser);
        return "account/baseInfo";
    }

    @PutMapping(value = "/account/mine")
    public String update(User user, Model model, HttpSession session, Map<String, Object> map) throws NoSuchAlgorithmException {
        User userSession = (User) session.getAttribute("loginUser");
        if (StringUtils.isEmpty(user.getOldPassword())) {
            userService.update(user);
            map.put("msg", "修改成功");
        } else {
            if (!MD5Helper.MD5Digest(user.getPassword()).equals(userSession.getPassword())) {
                map.put("msg", "旧密码不正确");
            } else {
                userService.update(user);
                map.put("msg", "修改成功");
            }
            return "account/updatePsd";
        }
        initPage(model);
        return "account/baseInfo";
    }


    @GetMapping(value = "/account/updatePsd")
    public String updatePsd(Model model, HttpSession session) {
        initPage(model);
        User loginUser = (User) session.getAttribute("loginUser");
        model.addAttribute("user", loginUser);
        return "account/updatePsd";
    }

    @PutMapping("/account/update")
    public String update(Model model, @RequestBody User user) {
       userService.update(user);
        model.addAttribute("msg","success");
        return userList(model,1,10);
    }

    @GetMapping("/account/refresh")
    public String localRefresh(Model model,@RequestParam(value = "page",defaultValue = "1") Integer page, @RequestParam(value = "limit",defaultValue = "10") Integer limit){
        return loadData(model,page,limit,"frame_refresh");
    }

    private String loadData(Model model,@RequestParam(value = "page",defaultValue = "1") Integer page, @RequestParam(value = "limit",defaultValue = "10") Integer limit,String view){
        initPage(model);
        PageHelper.startPage(page, limit);
        List<User> userList = userService.queryDetail();
        for (User user : userList) {
            List<Product> productList = userService.queryProductFlow(user.getId());
            for (Product product : productList) {
                user.setClickCount(user.getClickCount() + product.getClickCount());
                user.setReadCount(user.getReadCount() + product.getReadCount());
            }
        }
        model.addAttribute("users", userList);
        PageInfo<User> pageInfo = new PageInfo<>(userList);
        model.addAttribute("pageInfo", pageInfo);
        return userList(model,page,limit);
    }

}

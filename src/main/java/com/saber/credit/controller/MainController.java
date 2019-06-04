package com.saber.credit.controller;

import com.saber.credit.entities.Menu;
import com.saber.credit.service.MenuService;
import com.saber.credit.service.impl.MenuServiceImpl;
import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by saber on 2019/6/4
 * 首页
 */
@Controller
public class MainController {

    @Autowired
    private MenuServiceImpl menuService;

    @GetMapping("/main")
    public String sideMenu(Model model) {
        List<Menu> menus = menuService.query();
        List<Menu> menuList = new ArrayList<>();
        Map<String,List<Menu>> map = new HashMap<>();
        for (Menu menu : menus) {
            if (menu.getpId()==null||menu.getpId().equals("")){
                menuList.add(menu);
            }else {

            }
        }
        model.addAttribute("menus", menus);
        return "dashboard";
    }

}

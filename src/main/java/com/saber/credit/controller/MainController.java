package com.saber.credit.controller;

import com.saber.credit.entities.Menu;
import com.saber.credit.service.MenuService;
import com.saber.credit.service.impl.MenuServiceImpl;
import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
        Map<Integer,List<Menu>> listMap = menus.stream().collect(Collectors.groupingBy(Menu::getPid));
        model.addAttribute("menus", listMap);
        System.out.println(listMap);
        return "dashboard";
    }

}

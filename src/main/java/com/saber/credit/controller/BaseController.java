package com.saber.credit.controller;

import com.saber.credit.entities.Menu;
import com.saber.credit.service.impl.MenuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by saber on 2019/6/7
 */
public class BaseController {

    @Autowired
    private MenuServiceImpl menuService;

    /**
     *
     * @param model model
     */
    void initPage(Model model){
        List<Menu> menus = menuService.query();
        Map<Integer,List<Menu>> listMap = menus.stream().collect(Collectors.groupingBy(Menu::getPid));
        model.addAttribute("menus", listMap);
    }

}

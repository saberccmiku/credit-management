package com.saber.credit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by saber on 2019/6/4
 * 首页
 */
@Controller
public class MainController extends BaseController{

    @GetMapping("/main")
    public String sideMenu(Model model) {
        initPage(model);
        return "dashboard";
    }

}

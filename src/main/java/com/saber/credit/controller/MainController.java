package com.saber.credit.controller;

import com.github.pagehelper.PageHelper;
import com.saber.credit.entities.Information;
import com.saber.credit.service.impl.InformationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by saber on 2019/6/4
 * 首页
 */
@Controller
public class MainController extends BaseController{

    @Autowired
    private InformationServiceImpl informationService;

    @GetMapping("/main")
    public String sideMenu(Model model) {
        initPage(model);
        return "main/dashboard";
    }

    @GetMapping("/information")
    public String toAnnouncement(Model model){
        initPage(model);
        PageHelper.startPage(1,20);
        List<Information> informationList = informationService.query();
        model.addAttribute("informationList",informationList);
        return "main/information";
    }

}

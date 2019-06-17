package com.saber.credit.controller.statistics;

import com.saber.credit.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by saber on 2019/6/17.
 * 统计-用户注册量
 */
@Controller
public class registerController extends BaseController {

    @GetMapping(value = "/statistics/register")
    public String list(Model model){
        initPage(model);
        return "statistics/register";
    }
}

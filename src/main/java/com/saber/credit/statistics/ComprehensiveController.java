package com.saber.credit.statistics;

import com.saber.credit.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by saber on 2019/6/17.
 * 统计-综合统计
 */
@Controller
public class ComprehensiveController extends BaseController {

    @GetMapping(value = "/statistics/comprehensive")
    public String List(Model model){
        initPage(model);
        return "statistics/comprehensive";
    }
}

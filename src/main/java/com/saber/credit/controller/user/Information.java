package com.saber.credit.controller.user;

import com.saber.credit.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by saber on 2019/6/17.
 * 用户-消息通知
 */
@Controller
public class Information extends BaseController {

    @GetMapping(value = "user/information")
    public String List(Model model){
        initPage(model);
        return "user/information";
    }
}

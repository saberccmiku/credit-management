package com.saber.credit.controller.recommend;

import com.saber.credit.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by saber on 2019/6/17.
 * 首页推荐
 */
@Controller
public class HomeController extends BaseController {

    @GetMapping(value = "/recommend/home")
    public String list(Model model){
        initPage(model);
        return "recommend/home";
    }

}

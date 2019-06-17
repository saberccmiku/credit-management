package com.saber.credit.statistics;

import com.saber.credit.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by saber on 2019/6/17.
 * 统计-渠道统计
 */
@Controller
public class ChannelController extends BaseController {

    @GetMapping(value = "/statistics/channel")
    public String List(Model model){
        initPage(model);
        return "statistics/channel";
    }
}

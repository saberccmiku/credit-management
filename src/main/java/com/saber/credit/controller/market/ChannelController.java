package com.saber.credit.controller.market;

import com.saber.credit.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by saber on 2019/6/17.
 * 渠道管理
 */
@Controller
public class ChannelController extends BaseController {

    @GetMapping(value = "/market/channel")
    public String list(Model model){
        initPage(model);
        return "market/channel";

    }
}

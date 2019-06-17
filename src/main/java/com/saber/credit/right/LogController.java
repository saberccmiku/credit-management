package com.saber.credit.right;

import com.saber.credit.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by saber on 2019/6/17.
 * 权限-操作日志
 */
@Controller
public class LogController extends BaseController {

    @GetMapping(value = "/statistics/import")
    public String List(Model model){
        initPage(model);
        return "statistics/import";
    }
}

package com.saber.credit.controller.statistics;

import com.saber.credit.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by saber on 2019/6/17.
 * 统计-数据导入
 */
@Controller
public class ImportController extends BaseController {

    @GetMapping(value = "/statistics/import")
    public String list(Model model){
        initPage(model);
        return "statistics/import";
    }
}

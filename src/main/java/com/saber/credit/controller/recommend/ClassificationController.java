package com.saber.credit.controller.recommend;

import com.saber.credit.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by saber on 2019/6/17.
 *分类推荐
 */
@Controller
public class ClassificationController extends BaseController {

    @GetMapping(value = "/recommend/classification")
    public String list(Model model){
        initPage(model);
        return "recommend/classification";
    }

}

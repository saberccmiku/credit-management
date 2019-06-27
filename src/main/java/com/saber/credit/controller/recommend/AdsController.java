package com.saber.credit.controller.recommend;

import com.saber.credit.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by saber on 2019/6/17.
 *广告推荐
 */
@Controller
public class AdsController extends BaseController {

    @GetMapping(value = "/recommend/ads")
    public String list(Model model){
        initPage(model);
        initEnumerate(model,"IMG_RECOMMEND");
        return "recommend/ads";

    }

}

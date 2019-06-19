package com.saber.credit.controller.user;

import com.saber.credit.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

/**
 * Created by saber on 2019/6/17.
 * 用户-消息通知
 */
@Controller
public class MessageController extends BaseController {

    @GetMapping(value = "user/message")
    public String List(Model model){
        initPage(model);
        initEnumerate(model,"MESSAGE_TYPE");
        return "user/message";
    }

    @PostMapping(value = "user/sendMessage")
    public String sendMessage(Model model, Map<String,Object> map){
        map.put("msg","success");
        initPage(model);
        initEnumerate(model,"MESSAGE_TYPE");
        return "user/message";
    }
}

package com.saber.credit.controller.user;

import com.saber.credit.controller.BaseController;
import com.saber.credit.entities.Message;
import com.saber.credit.service.impl.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Map;

/**
 * Created by saber on 2019/6/17.
 * 用户-消息通知
 */
@Controller
public class MessageController extends BaseController {


    @Autowired
    private MessageServiceImpl messageService ;

    @GetMapping(value = "user/message")
    public String list(Model model){
        List<Message> messages = messageService.query(1, 20);
        model.addAttribute("messages",messages);
        initPage(model);
        initEnumerate(model,"MESSAGE_TYPE");
        return "user/message";
    }

    @PostMapping(value = "user/sendMessage")
    public String sendMessage(Message message,Model model, Map<String,Object> map){
        messageService.insert(message);
        map.put("msg","success");
        initPage(model);
        return list(model);
    }

    @DeleteMapping(value = "/message/{id}")
    public String deleteMessage(@PathVariable("id") String id,Model model,Map<String,Object> map){
        messageService.delete(id);
        map.put("msg","success");
        return list(model);
    }
}

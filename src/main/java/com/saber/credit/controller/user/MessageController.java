package com.saber.credit.controller.user;

import com.alibaba.druid.sql.visitor.functions.If;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.saber.credit.controller.BaseController;
import com.saber.credit.entities.Message;
import com.saber.credit.service.impl.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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
    public String list(Model model, @RequestParam (value = "page",defaultValue = "1") Integer page, @RequestParam (value = "limit",defaultValue = "2") Integer limit){
        PageHelper.startPage(page,limit);
        List<Message> messages = messageService.query();
        model.addAttribute("messages",messages);
        PageInfo<Message> pageInfo = new PageInfo<>(messages);
        model.addAttribute("pageInfo",pageInfo);
        initPage(model);
        initEnumerate(model,"MESSAGE_TYPE");
        return "user/message";
    }


    /**
     * 局部刷新，注意返回值
     * @param model
     * @return
     */
    @GetMapping("user/message/refresh")
    public String localRefresh(Model model, @RequestParam (value = "page",defaultValue = "1") Integer page, @RequestParam (value = "limit",defaultValue = "2") Integer limit) {
        // "test"是test.html的名，
        // "table_refresh"是test.html中需要刷新的部分标志,
        // 在标签里加入：th:fragment="table_refresh"
        PageHelper.startPage(page,limit);
        List<Message> messages = messageService.query();
        model.addAttribute("messages",messages);
        PageInfo<Message> pageInfo = new PageInfo<>(messages);
        model.addAttribute("pageInfo",pageInfo);
        return "user/message::table_refresh";
    }

    @PostMapping(value = "user/sendMessage")
    public String sendMessage(Message message,Model model, Map<String,Object> map){
        messageService.insert(message);
        map.put("msg","success");
        initPage(model);
        return list(model,1,20);
    }

    @DeleteMapping(value = "/message/{id}")
    public String deleteMessage(@PathVariable("id") String id,Model model,Map<String,Object> map){
        messageService.delete(id);
        map.put("msg","success");
        return list(model,1,20);
    }
}

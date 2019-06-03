package com.jlkj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by saber on 2019/6/3
 */
@RestController
public class HelloController {
    @ResponseBody
    @GetMapping(value = "/")
    public String Hello(){
        return "hello world";
    }
}

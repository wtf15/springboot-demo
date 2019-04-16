package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author wtf
 * @date 2019/4/15 17:07
 * @description: Thymeleaf模板类
 */
@Controller
@RequestMapping("thymeleaf")
public class ThymeleafController {

    @RequestMapping("helloThymeleaf")
    public String hello(Map<String,Object> map) {
        map.put("msg", "Hello Thymeleaf");
        return "helloThymeleaf";
    }
}

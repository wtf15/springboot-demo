package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wtf
 * @date 2019/4/7 15:24
 * @description:
 */
@RestController
public class HelloController {
    @RequestMapping("hello")
    public String sayHello(){
        return "hello Spring-Boot";
    }
}

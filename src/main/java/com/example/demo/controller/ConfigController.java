package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wtf
 * @date 2019/4/7 16:28
 * @description: 得到配置文件中配置的属性值
 */
@RestController
public class ConfigController {
    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private int age;

    @RequestMapping("/getConfigInfo")
    public String getConfigInfo(){
        return name+":"+age;
    }
}

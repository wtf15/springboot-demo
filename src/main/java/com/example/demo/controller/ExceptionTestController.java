package com.example.demo.controller;

import com.example.demo.exception.MyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wtf
 * @date 2019/4/12 17:04
 * @description: 异常测试类
 */
@RestController
public class ExceptionTestController {
    @RequestMapping("/testException")
    public String json() throws MyException {
        throw new MyException("发生异常");
    }
}

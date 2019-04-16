package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wtf
 * @date 2019/4/16 19:43
 * @description: webSocket的测试controller
 */
@Controller
@RequestMapping("webSocket")
public class WebSocketController {

    @RequestMapping("toWebSocket")
    public String toWebSocket() {
        return "webSocketTest";
    }
}

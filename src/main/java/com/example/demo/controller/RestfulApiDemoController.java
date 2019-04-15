package com.example.demo.controller;

import com.example.demo.bean.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wtf
 * @date 2019/4/11 11:25
 * @description:
 */
@RestController
@RequestMapping(value="/restfulApiDemo")
public class RestfulApiDemoController {
    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());

    @ApiOperation(value="创建用户", notes="根据User对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @PostMapping(value="/putUser")
    public String putUser(User user) {
        users.put(user.getId(), user);
        return "success";
    }

    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @GetMapping(value="/{id}")
    public User getUser(@PathVariable Long id) {
        return users.get(id);
    }

}

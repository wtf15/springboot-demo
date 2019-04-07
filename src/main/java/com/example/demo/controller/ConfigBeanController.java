package com.example.demo.controller;

import com.example.demo.bean.ConfigBean;
import com.example.demo.bean.ConfigPropertiesBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wtf
 * @date 2019/4/7 16:28
 * @description: 得到配置实体类中配置的属性值
 */
@RestController
@EnableConfigurationProperties({ConfigBean.class, ConfigPropertiesBean.class})
public class ConfigBeanController {
    @Autowired
    ConfigBean configBean;

    @RequestMapping("/getConfigBeanInfo")
    public String getConfigBeanInfo(){
        return configBean.getGreeting()+"-"+configBean.getName()+"-"+configBean.getValue();
    }

    @Autowired
    ConfigPropertiesBean configPropertiesBean;
    @RequestMapping("/getConfigPropertiesBeanInfo")
    public String getConfigPropertiesBeanInfo(){
        return configPropertiesBean.getName()+"-"+configPropertiesBean.getAge();
    }
}

package com.example.bai02profile.controller;

import com.example.bai02profile.domain.ConfigBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@EnableConfigurationProperties(ConfigBean.class)
public class MiyaController {

    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private int age;

    @Resource
    private ConfigBean configBean;

    @RequestMapping(value = "/miya")
    public String miya(){
        return name+":"+age;
    }

//    @RequestMapping(value = "/lucy")
//    public String lucy(){
//        return configBean.getGreeting()+" >>>>"+configBean.getName()+" >>>>"+ configBean.getUuid()+" >>>>"+configBean.getMax();
//    }
}
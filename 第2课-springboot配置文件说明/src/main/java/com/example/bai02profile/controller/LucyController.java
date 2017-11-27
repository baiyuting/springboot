package com.example.bai02profile.controller;

import com.example.bai02profile.domain.ConfigBean;
import com.example.bai02profile.domain.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@EnableConfigurationProperties({ConfigBean.class, User.class})
public class LucyController {

    @Resource
    private ConfigBean configBean;

    @Resource
    private User user;

    @RequestMapping(value = "/lucy")
    public String lucy(){
        return configBean.getGreeting()+" >>>>"+configBean.getName()+" >>>>"+ configBean.getUuid()+" >>>>"+configBean.getMax();
    }


    @RequestMapping(value = "/user")
    public String user(){
        return user.getName()+user.getAge();
    }
}
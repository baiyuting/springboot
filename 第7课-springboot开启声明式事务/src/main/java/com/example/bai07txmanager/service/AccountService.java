package com.example.bai07txmanager.service;

import com.example.bai07txmanager.dao.AccountMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class AccountService {

    @Resource
    private AccountMapper accountMapper;

    @Transactional
    public void transfer() throws RuntimeException {
        accountMapper.update(90, 1);//用户1减10块 用户2加10块
        int i = 1 / 0;
        accountMapper.update(110, 2);
    }
}
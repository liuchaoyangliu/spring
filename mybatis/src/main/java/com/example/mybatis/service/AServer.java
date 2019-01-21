package com.example.mybatis.service;

import com.example.mybatis.dao.AccountMapper;
import com.example.mybatis.entity.Account;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AServer {

    @Autowired
    AccountMapper accountMapper;

    public Page<Account> getUserList(){
        PageHelper.startPage(1, 10);
        Page<Account>  userList= accountMapper.getUserList();
        return userList;
    }

}

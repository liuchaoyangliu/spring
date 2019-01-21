package com.example.mybatis.web;

import com.example.mybatis.entity.Account;
import com.example.mybatis.service.AServer;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    @Autowired
    AServer aServer;

    @RequestMapping("/getUserList")
    public Page<Account> getUserList(){
        return aServer.getUserList();
    }

}




package com.example.page.web;

import com.example.page.entity.Account;
import com.example.page.seriver.AccountService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    @Autowired
    AccountService accountService;

    @RequestMapping("/getUserList")
    public Page<Account> getUserList(@RequestParam(value = "pageNum", defaultValue = "2") Integer pageNum,
                                     @RequestParam(value = "pageSize", defaultValue = "6") Integer pageSize){
        return accountService.getUserList(pageNum, pageSize);
    }

}


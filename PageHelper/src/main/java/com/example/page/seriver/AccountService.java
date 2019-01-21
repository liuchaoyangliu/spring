package com.example.page.seriver;


import com.example.page.dao.AccountMapper;
import com.example.page.entity.Account;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    AccountMapper accountMapper;

    public Page<Account> getUserList(int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        Page<Account>  userList= accountMapper.getUserList();
        return userList;
    }

}

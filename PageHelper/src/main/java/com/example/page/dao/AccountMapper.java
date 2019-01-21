package com.example.page.dao;


import com.example.page.entity.Account;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AccountMapper {
    @Select("select id, name as name, money as money from account")
    Page<Account> getUserList();
}
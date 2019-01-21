package com.example.mybatis._test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Demo {

    public static void main(String[] args) throws Exception {
        // 1.加载数据访问驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.连接到数据"库"上去
        String url = "jdbc:mysql://localhost:3306/springboot?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=GMT%2B8";
        Connection conn= DriverManager.getConnection(url, "root", "root");
        //3.构建SQL命令
//        Statement state=conn.createStatement();
        PreparedStatement pst = conn.prepareStatement("insert into account values(?,?,?)");
        for (int i = 0; i < 100; i++) {
            pst.setInt(1, i + 12);
            pst.setString(2,(int)(Math.random() * 10000) + "");
            pst.setDouble(3, Math.random() * 1000);
            pst.execute();
        }
    }


}

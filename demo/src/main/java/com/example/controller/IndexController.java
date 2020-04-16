package com.example.controller;

import com.example.service.JdbcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @create: 2020-03-30 11:34
 **/
@RestController
public class IndexController {

    @Autowired
    private JdbcService jdbcService;
    @RequestMapping("/sss")
    public String string (){
        return "index";
    }

    @RequestMapping("/addUser")
    public boolean addUser(String userName,Integer age){
        return jdbcService.addUser(userName,age);
    }
}

package com.example.service.impl;

import com.example.service.JdbcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @create: 2020-03-30 15:03
 **/
@Service
public class JdbcServiceImpl implements JdbcService {
    @Autowired
    private JdbcTemplate  jdbcTemplate;

    public boolean addUser(String userName,Integer age){
        int insertUser=jdbcTemplate.update("insert into users values(null,?,?);", userName, age);
        return insertUser >0 ? true : false;
    }
}

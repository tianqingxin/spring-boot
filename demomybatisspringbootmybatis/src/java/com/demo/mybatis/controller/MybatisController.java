package com.demo.mybatis.controller;

import com.demo.mybatis.mapper.MybatisMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
/**
 * @description:
 * @create: 2020-03-30 16:38
 **/
@RestController
public class MybatisController {

    @Autowired
    private MybatisMapper mybatisMapper;
    @RequestMapping("/getUser")
    public Map<String,Object> getUserInfo(Integer id){
        return mybatisMapper.getUserById(id);
    }
}

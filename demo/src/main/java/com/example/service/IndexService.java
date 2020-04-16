package com.example.service;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @description:
 * @create: 2020-03-30 11:14
 **/
@RestController
//@RequestMapping("/map")
public class IndexService {

    @RequestMapping("/getMap")
    public Map<String,Object> index(){
        Map<String,Object> map =new HashMap<>();
        map.put("code","200");
        map.put("state","成功");
        return map;
    }
}

package com.example.service;

import com.sun.javafx.collections.MappingChange;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import  java.util.Map;

/**
 * @description:
 * @create: 2020-03-30 12:24
 **/
@Controller
public class FreeMarkerService {

    @RequestMapping("/freeMarkerIndex")
    public String freeMarkerIndex(Map<String,Object>  returnMap){
        returnMap.put("name","田庆新");
        returnMap.put("sex","1");
        List<Object> list=new ArrayList<>();
        list.add("是一个");
        list.add("好人");
        returnMap.put("userlist",list);
        return "freeMarkerIndex";
    }
}

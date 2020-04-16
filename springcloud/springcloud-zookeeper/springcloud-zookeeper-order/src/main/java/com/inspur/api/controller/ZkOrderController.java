package com.inspur.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @create: 2020-04-05 01:06
 **/
@RestController
public class ZkOrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${eureka-member.url}")
    private String url;
    @RequestMapping("/getOrderMember")
    public String getOrderMember(){
        String info=restTemplate.getForObject(url,String.class);
        return "会员信息："+info;
    }
}

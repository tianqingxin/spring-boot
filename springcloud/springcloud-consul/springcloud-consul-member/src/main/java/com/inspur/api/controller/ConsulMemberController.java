package com.inspur.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @create: 2020-04-05 00:54
 **/
@RestController
public class ConsulMemberController {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${server.port}")
    private String serverPort;
    @RequestMapping("/getMember")
    public String getMember(){
        return "会员：tqx，端口号："+serverPort;
    }

    @RequestMapping("/getMemberOrder")
    public String getMemberOrder(){
        String url="http://consul-order/getOrder";
        return  restTemplate.getForObject(url,String.class);
    }
}

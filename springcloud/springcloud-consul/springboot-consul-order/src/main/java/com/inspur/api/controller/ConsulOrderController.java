package com.inspur.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @create: 2020-04-05 01:38
 **/
@RestController
public class ConsulOrderController {
    @Autowired
    private RestTemplate restTemplate;


    @Value("${server.port}")
    private String serverPort;
    @RequestMapping("/getOrderMember")
    public String getOrderMember(){
        String url="http://consul-member/getMember";
        String info=restTemplate.getForObject(url,String.class);
        return "会员信息："+info;
    }

    @RequestMapping("/getOrder")
    public String getOrder(){
        return "会员订单号：112233，端口号"+serverPort;
    }
}

package com.inspur.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @create: 2020-04-04 23:34
 **/
@RestController
public class EurekaMemberApiController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/getMember")
    public String getMember(){
        return "会员名：tqx，端口号："+serverPort;
    }
}

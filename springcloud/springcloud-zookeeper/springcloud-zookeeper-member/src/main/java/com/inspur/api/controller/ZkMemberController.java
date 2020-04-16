package com.inspur.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @create: 2020-04-05 00:54
 **/
@RestController
public class ZkMemberController {

    @Value("${server.port}")
    private String serverPort;
    @RequestMapping("/getMember")
    public String getMember(){
        return "会员：tqx，端口号："+serverPort;
    }
}

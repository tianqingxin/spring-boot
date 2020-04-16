package com.inspur.health;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consul")
public class HealthConfig {

    @Value("${spring.application.name}")
    private String springAppName;
    @Value("${server.port}")
    private String serverPort;
    @RequestMapping("/health")
    public String health(){
        return "consul health"+"服务名："+springAppName+",端口号："+serverPort;
    }
}
package com.inspur.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @create: 2020-04-08 18:34
 **/
@RestController
@RefreshScope //刷新文件
public class ConfigClient {

    @Value("${inspur.user-name}")
    private String inspurName;

    @RequestMapping("/getName")
    public String name(){
        return inspurName;
    }
}

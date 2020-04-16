package com.inspur;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description:
 * @create: 2020-04-06 00:09
 **/
@SpringBootApplication
//@EnableEurekaClient
@EnableSwagger2Doc  //启动时扫描所有swagger标注的接口生成文档
public class MemberApp {
    public static void main(String[] args) {
        SpringApplication.run(MemberApp.class);
    }
}

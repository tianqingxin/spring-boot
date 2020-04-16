package com.demo.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @create: 2020-03-30 16:41
 **/
@SpringBootApplication
@MapperScan("com.demo.mybatis.mapper")
public class StartSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartSpringBootApplication.class,args);
    }
}

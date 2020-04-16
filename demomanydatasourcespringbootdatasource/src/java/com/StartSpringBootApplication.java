package com;

import com.demo.manydatasource.config.MemberConfig;
import com.demo.manydatasource.config.OrderConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @description:
 * @create: 2020-03-30 17:36
 **/
@SpringBootApplication
@EnableConfigurationProperties({MemberConfig.class, OrderConfig.class})
//启动扫描定时任务
@EnableScheduling
public class StartSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartSpringBootApplication.class,args);
    }
}

package com.inspur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEurekaServer9000Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaServer9000Application.class, args);
    }

}

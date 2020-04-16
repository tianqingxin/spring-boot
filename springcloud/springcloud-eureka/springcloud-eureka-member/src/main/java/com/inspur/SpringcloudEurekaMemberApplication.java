package com.inspur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudEurekaMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaMemberApplication.class, args);
    }

}

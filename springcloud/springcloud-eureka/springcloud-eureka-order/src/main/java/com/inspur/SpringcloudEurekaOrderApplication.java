package com.inspur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudEurekaOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaOrderApplication.class, args);
    }

}

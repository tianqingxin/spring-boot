package com.inspur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudConsulMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsulMemberApplication.class, args);
    }

}

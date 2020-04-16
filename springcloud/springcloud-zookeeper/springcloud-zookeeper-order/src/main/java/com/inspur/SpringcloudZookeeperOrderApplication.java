package com.inspur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudZookeeperOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudZookeeperOrderApplication.class, args);
    }

}

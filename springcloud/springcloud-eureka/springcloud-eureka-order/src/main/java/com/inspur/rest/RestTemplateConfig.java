package com.inspur.rest;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @create: 2020-04-04 23:51
 **/
@Configuration
public class RestTemplateConfig {
    @Bean
    @LoadBalanced //启动负载均衡器，当使用rest请求，且以服务别名请求时，需要添加
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}

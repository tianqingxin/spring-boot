package com.inspur.api;

import com.inspur.entity.ApiEntity;
import com.inspur.service.impl.AppService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @create: 2020-04-01 14:03
 **/
@Configuration
@EnableConfigurationProperties({ApiEntity.class})
public class ApiConfiguration {

    @Bean
    public AppService appService(){
        return new AppService();
    }
}

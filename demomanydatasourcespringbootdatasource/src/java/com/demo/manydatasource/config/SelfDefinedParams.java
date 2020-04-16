package com.demo.manydatasource.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @description: 通过注入容器方式获取yml文件中的参数
 * @create: 2020-04-01 11:52
 **/
@Configuration //作用是生成xml容器  ，其类下如使用@Bean注解，则表示该方法生成bean
@ConfigurationProperties(prefix = "inspur.self-defined")
@Data
public class SelfDefinedParams {
    private  String userName;
}

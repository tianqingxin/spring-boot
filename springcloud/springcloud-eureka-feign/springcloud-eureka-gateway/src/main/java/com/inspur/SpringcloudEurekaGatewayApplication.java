package com.inspur;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;

@SpringBootApplication
@EnableZuulProxy  //开启zuul网关代理
@EnableEurekaClient
@EnableSwagger2Doc
public class SpringcloudEurekaGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaGatewayApplication.class, args);
    }

    //zuul配置能够使config文件自动更新
     @RefreshScope
    @ConfigurationProperties("zuul")
    public ZuulProperties zuulProperties(){
        return new ZuulProperties();
    }

}

package com.inspur.api.util;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @description: 初始化配置信息的单例，同时注入系统供其他地方调用
 * @create: 2020-04-13 10:48
 **/
@Configuration
@Data
public class EntityUtil {
    @Value("${server.port}")
    private  String serverPort;

    private EntityUtil(){

    }

    @Bean
    public EntityUtil getEntityUtil(){
        return Singleton.INSTANCE.getEntityUtil();
    }

    private enum  Singleton{
        INSTANCE;
        private  EntityUtil entityUtil;

        Singleton(){
            entityUtil = new EntityUtil();
        }

        public EntityUtil getEntityUtil(){
            return entityUtil;
        }
    }
}

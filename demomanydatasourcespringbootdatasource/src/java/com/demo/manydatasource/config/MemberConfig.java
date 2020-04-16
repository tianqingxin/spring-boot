package com.demo.manydatasource.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @description:
 * @create: 2020-03-31 09:06
 **/
@ConfigurationProperties(prefix = "spring.datasource.member")
@Data
public class MemberConfig {
    private String url;
    private String userName;
    private String passWord;
    private int minPoolSize;
    private int maxPoolSize;
    private int maxLifetime;
    private int borrowConnectionTimeout;
    private int loginTimeout;
    private int maintenanceInterval;
    private int maxIdleTime;
    private String testQuery;
    private String uniqueResourceName;
}

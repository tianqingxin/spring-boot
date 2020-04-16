package com.inspur.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @description:
 * @create: 2020-04-01 14:09
 **/
@ConfigurationProperties(prefix = "inspur")
@Data
public class ApiEntity {
    private String userName;
    private String password;
}

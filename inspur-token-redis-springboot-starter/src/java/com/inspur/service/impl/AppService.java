package com.inspur.service.impl;

import com.inspur.entity.ApiEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @create: 2020-04-01 14:02
 **/
@Service
public class AppService  {
    @Autowired
    private ApiEntity apiEntity;

    public String getToken() {
        return apiEntity.getUserName()+":"+apiEntity.getPassword();
    }
}

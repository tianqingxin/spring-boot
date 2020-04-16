package com.inspur.webservice.service.impl;

import com.inspur.webservice.service.DemoService;

import javax.jws.WebService;

/**
 * @description:
 * @create: 2020-04-02 16:32
 **/
@WebService(name = "DemoService",//暴露的服务名称，与接口上的属性一致
targetNamespace = "http://service.webservice.inspur.com",//与接口中的命名空间一致,命名空间，一般为接口的包名倒序
endpointInterface = "com.inspur.webservice.service.DemoService" //接口地址
)
public class DemoServiceImpl implements DemoService {

    @Override
    public String getStr(String user) {
        return "姓名:"+user;
    }
}

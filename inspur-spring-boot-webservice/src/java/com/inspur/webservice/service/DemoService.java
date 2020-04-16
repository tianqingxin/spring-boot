package com.inspur.webservice.service;

import javax.jws.WebService;

/**
 * @description: webservice接口
 * @create: 2020-04-02 16:29
 **/
@WebService(name = "DemoService",//暴露的服务名称
targetNamespace = "http://service.webservice.inspur.com" //命名空间，一般为接口的包名倒序
)
public interface DemoService {
    public String getStr(String user);
}

package com.inspur.webservice.cxf;

import com.inspur.webservice.service.DemoService;
import com.inspur.webservice.service.impl.DemoServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * @description:
 * @create: 2020-04-02 16:36
 **/
@Configuration
public class CXFConfig {
    @Bean
    public ServletRegistrationBean dispatcherServlet(){
        return new ServletRegistrationBean(new CXFServlet(),"/webApp/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus(){
        return new SpringBus();
    }

    @Bean
    public DemoService demoService(){
        return new DemoServiceImpl();
    }

    @Bean
    public Endpoint endpoint(){
        EndpointImpl endpoint=new EndpointImpl(springBus(),demoService());
        endpoint.publish("/api");
        return endpoint;
    }

}

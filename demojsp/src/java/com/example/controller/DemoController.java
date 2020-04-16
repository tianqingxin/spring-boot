package com.example.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//作用：声明该类下所有接口返回值均为json格式
@SpringBootApplication
@Controller
public class DemoController {

    @RequestMapping("/sss")
    public String string (){
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoController.class, args);
    }

}

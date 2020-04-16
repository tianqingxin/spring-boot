package demo.jdbc.controller;

import demo.jdbc.service.JDBCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @create: 2020-03-30 15:41
 **/
@RestController
public class JDBCController {
    Autowired
    private JDBCService jdbcService;

    @RequestMapping("/addUser")
    public String addUser(String userName,Integer age){
        return jdbcService.addUser(userName,age) ? "success":"failure";
    }
}

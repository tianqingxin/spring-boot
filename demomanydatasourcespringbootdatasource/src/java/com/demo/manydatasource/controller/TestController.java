package com.demo.manydatasource.controller;

import com.demo.manydatasource.config.OrderDataSourceConfig;
import com.demo.manydatasource.config.SelfDefinedParams;
import com.demo.manydatasource.member.mapper.MemberMapper;
import com.demo.manydatasource.member.service.MemberService;
import com.demo.manydatasource.order.mapper.OrderMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
/**
 * @description:
 * @create: 2020-03-30 17:31
 **/
@RestController
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
    @Autowired
    private MemberMapper memberMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private  MemberService memberService;

    //通过注入容器方式获取yml文件中的参数
    @Autowired
    private SelfDefinedParams selfDefinedParams;

    //使用value方式获取yml自定义参数
    @Value("${inspur.self-defined.username}")
    private String username;
    @Value("${inspur.self-defined.userName}")
    private String userName;
    @RequestMapping("/getUser")
    public Map<String,Object> getUserInfo(Integer id){
        return memberMapper.getUserById(id);
    }

    @RequestMapping("/insertOrder")
    public String insertOrder (String orderNo,String orderName){
        return orderMapper.insertOrder(orderNo,orderName) >0 ? "success":"failure";
    }

    @RequestMapping("/addInfo/{userName}/{age}/{orderNo}/{orderName}")
    public String addInfo(@PathVariable("userName")String userName,@PathVariable("age")Integer age,
                          @PathVariable("orderNo")String orderNo,@PathVariable("orderName")String orderName){
        logger.info("info---ssssss");
        logger.debug("debug----ssssss");
        return memberService.getState(orderNo,orderName,age,userName);
    }

    /**
     * /使用value方式获取yml自定义参数
     * @return
     */
    @RequestMapping("/getName")
    public String getName (){
        return "username=="+username+";userName=="+userName+";orderName==="+selfDefinedParams.getUserName();
    }

}

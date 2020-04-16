package com.inspur.api.order.impl;

import com.inspur.base.BaseApiService;
import com.inspur.base.ResponseBase;
import com.inspur.entity.member.MemberEntity;
import com.inspur.feign.MemberServiceFeign;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @description:
 * @create: 2020-04-06 00:01
 **/
@Api("订单服务接口")
@RestController
@Validated //开启数据校验，添加在类上用于校验方法，添加在方法参数中用于校验参数对象。(添加在方法上无效)
public class OrderServiceImpl extends BaseApiService {
    @Autowired
    private MemberServiceFeign memberServiceFeign;
    @ApiOperation(value = "获取订单信息",notes = "获取订单信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name",value = "名称",required = true,dataType = "String"),
            @ApiImplicitParam(name = "age",value = "年龄",required = true,dataType = "Integer")
    })
    @RequestMapping("/getOrderMember/{name}/{age}")
    public MemberEntity getOrderMember(@PathVariable("name")
                                       @Length(min = 1, max = 6, message = "name长度必须介于{min} - {max}之间")
                                       @NotNull(message = "name不允许为空")
                                               String name,
                                       @PathVariable("age")
                                       @Min(value = 1, message = "年龄不能小于{value}岁")
                                               Integer age) {
        return memberServiceFeign.getMember(name, age);
    }

    //声明该方法使用断路器，fallbackMethod表示调用远程服务失败后调用的方法
//    @HystrixCommand(fallbackMethod = "getMemberInfoFallBack")
    @RequestMapping("/getMemberInfo")
    public ResponseBase getMemberInfo(){
        return memberServiceFeign.getMemberInfo();
    }

    @RequestMapping("/")
    public String getStr(){
        return "order调用成功!!!";
    }
}

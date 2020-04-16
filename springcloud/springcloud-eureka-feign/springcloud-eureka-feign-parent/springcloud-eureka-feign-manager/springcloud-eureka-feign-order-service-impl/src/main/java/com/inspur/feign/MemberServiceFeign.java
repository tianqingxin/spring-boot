package com.inspur.feign;

import com.inspur.api.service.member.IMemberService;
import com.inspur.fallback.MemberServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "eureka-member",fallback = MemberServiceFallBack.class)  //通过继承会员接口，实现feign客户端远程调用，同时省略重复代码
//fallback方法是指定hystrix服务降级所实现的类
public interface MemberServiceFeign extends IMemberService {

}

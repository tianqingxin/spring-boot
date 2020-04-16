package com.inspur.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description:
 * @create: 2020-04-04 23:45
 **/
@RestController
public class EurekaOrderApiController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${eureka-member.url}")
    private String url;
    @RequestMapping("/getOrderMember")
    public String getOrderMember(){
        String info=restTemplate.getForObject(url,String.class);
        return "会员信息："+info;
    }

//下方方法为自己实现ribbon负载均衡轮训机制的方法，使用时请务必先将RestTemplate的@LoadBalanced去掉，以免受到负载均衡的影响
//    @Autowired
//    private DiscoveryClient discoveryClient;
//    private AtomicInteger atomicInteger =new AtomicInteger(1);

//    /**
//     * 自写负载均衡策略访问服务，此时必须将RestTemplate的@LoadBalanced去掉
//     * @param service_id
//     * @return
//     */
//    @RequestMapping("/getOrderMemberWithExtRibbon/{service_id}/{getMember}")
//    public String getOrderMemberWithExtRibbon(@PathVariable("service_id") String service_id,@PathVariable("getMember") String getMember){
//        //根据service_id获取注册中心中有的服务
//        String url=getUrl(service_id,getMember);
//        return restTemplate.getForObject(url,String.class);
//    }
//
//    /**
//     * 采用轮训机制获取要访问服务的url
//     * @param service_id
//     * @return
//     */
//    public  String getUrl(String service_id,String getMember){
//        List<ServiceInstance> getInstances =discoveryClient.getInstances(service_id);
//        if(StringUtils.isEmpty(getInstances)){
//            return null;
//        }
//        //获取服务列表的数量
//        int serviceSize=getInstances.size();
//        //仿照ribbon的负载均衡策略的轮训机制，以 访问总次数 % 服务列表数量的方式计算出要访问接口在集合中的索引
//        int index=atomicInteger.getAndAdd(1) % serviceSize;
//        return getInstances.get(index).getUri().toString()+"/"+getMember;
//    }
}

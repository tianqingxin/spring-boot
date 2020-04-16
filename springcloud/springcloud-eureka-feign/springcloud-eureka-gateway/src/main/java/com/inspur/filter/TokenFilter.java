package com.inspur.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.http.protocol.RequestContent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @description: zuul拦截器
 * @create: 2020-04-08 16:19
 **/
//@Component
public class TokenFilter extends ZuulFilter {

    @Value("${server.port}")
    private String serverPort;
    //过滤器类型，pre为在请求之前拦截，post为请求之后
    @Override
    public String filterType() {
        return "pre";
    }

    //过滤器执行顺序，当请求在一个阶段存在多个过滤器的时候，需要根据该方法的返回值依次执行
    @Override
    public int filterOrder() {
        return 0;
    }


    //是否启用过滤器
    @Override
    public boolean shouldFilter() {
        return true;
    }

    //过滤器拦截请求后进行的处理
    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext=RequestContext.getCurrentContext();
        HttpServletRequest request=requestContext.getRequest();
        System.out.println("gateway端口号为："+serverPort);
        if(StringUtils.isEmpty(request.getParameter("userToken"))){
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(401);
            requestContext.setResponseBody("userToken is null!!!");
            return null;
        }
        return null;
    }
}

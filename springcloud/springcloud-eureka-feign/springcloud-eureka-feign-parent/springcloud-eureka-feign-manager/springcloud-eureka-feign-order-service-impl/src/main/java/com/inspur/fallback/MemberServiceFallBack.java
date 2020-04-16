package com.inspur.fallback;

import com.inspur.base.BaseApiService;
import com.inspur.base.ResponseBase;
import com.inspur.entity.member.MemberEntity;
import com.inspur.feign.MemberServiceFeign;
import org.springframework.stereotype.Component;

/**
 * @description: hystrix断路器做服务熔断后的统一降级
 * @create: 2020-04-07 21:11
 **/
@Component
public class MemberServiceFallBack extends BaseApiService implements MemberServiceFeign {

    @Override
    public MemberEntity getMember(String name, Integer age) {
        return null;
    }

    @Override
    public ResponseBase getMemberInfo() {
        return setResultError("failure fallback");
    }
}

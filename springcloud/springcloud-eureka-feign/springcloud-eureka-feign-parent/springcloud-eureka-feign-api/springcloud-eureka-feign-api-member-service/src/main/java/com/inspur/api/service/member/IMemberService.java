package com.inspur.api.service.member;

import com.inspur.base.ResponseBase;
import com.inspur.entity.member.MemberEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public interface IMemberService {

    @RequestMapping("/getMember/{name}/{age}")
    public MemberEntity getMember(@PathVariable("name") String name,@PathVariable("age") Integer age);

    @RequestMapping("/getMemberInfo")
    public ResponseBase getMemberInfo();
}

package com.demo.manydatasource.member.service;
import java.util.Map;

public interface MemberService {
    Map<String,Object>  getUserById(Integer id);

    int insertUser(String userName,Integer age);
    public String getState(String orderNo,String orderName,Integer age,String userName);
}

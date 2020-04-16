package com.demo.manydatasource.member.service.impl;

import com.demo.manydatasource.member.mapper.MemberMapper;
import com.demo.manydatasource.member.service.MemberService;
import com.demo.manydatasource.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * @description:
 * @create: 2020-03-31 09:50
 **/
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Autowired
    private OrderService orderService;
    @Override
    public Map<String, Object> getUserById(Integer id) {
        return memberMapper.getUserById(id);
    }

    @Override
    public int insertUser(String userName, Integer age) {
        return memberMapper.insertUser(userName,age);
    }

    @Transactional
    public String getState(String orderNo,String orderName,Integer age,String userName){
        int userNum=memberMapper.insertUser(userName,age);
        int orderNum=orderService.insertOrder(orderNo,orderName);
        int s= 1/age;
        return s >0 ? "success" : "failure";
    }
}

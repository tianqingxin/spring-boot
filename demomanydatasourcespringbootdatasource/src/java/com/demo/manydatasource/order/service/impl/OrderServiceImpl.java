package com.demo.manydatasource.order.service.impl;

import com.demo.manydatasource.order.mapper.OrderMapper;
import com.demo.manydatasource.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @create: 2020-03-31 09:53
 **/
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Override
    public int insertOrder(String orderNo, String orderName) {
        return orderMapper.insertOrder(orderNo,orderName);
    }
}

package com.demo.manydatasource.order.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

public interface OrderMapper {

    @Insert("insert into order_info (order_no,order_name) values (#{orderNo},#{orderName})")
    int  insertOrder(@Param("orderNo")String orderNo,@Param("orderName") String orderName);
}

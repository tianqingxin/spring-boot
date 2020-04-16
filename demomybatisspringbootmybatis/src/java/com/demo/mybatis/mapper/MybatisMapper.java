package com.demo.mybatis.mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Map;
public interface MybatisMapper {

    @Select("select * from users where id=#{id}")
    Map<String,Object>  getUserById(@Param("id") Integer id);
}

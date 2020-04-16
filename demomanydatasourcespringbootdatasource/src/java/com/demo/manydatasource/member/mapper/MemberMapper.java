package com.demo.manydatasource.member.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.SqlSessionTemplate;

import javax.annotation.Resource;
import java.util.Map;

public interface MemberMapper {

    @Select("select * from users where id=#{id}")
    Map<String,Object>  getUserById(@Param("id") Integer id);

    @Insert("insert into users (name,age) values (#{userName},#{age})")
    int insertUser(@Param("userName") String userName, @Param("age") Integer age);
}

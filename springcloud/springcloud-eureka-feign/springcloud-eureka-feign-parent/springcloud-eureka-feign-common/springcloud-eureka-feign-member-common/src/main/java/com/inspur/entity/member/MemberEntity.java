package com.inspur.entity.member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @description: 会员pojo类
 * @create: 2020-04-05 23:47
 **/
@Data
@NoArgsConstructor //无参构造方法
@AllArgsConstructor //全参构造方法
public class MemberEntity {
    @Length(min = 1,max = 6,message = "name长度必须介于{min} - {max}之间")
    @NotNull(message = "name不允许为空")
    private  String name;
    @Min(value = 1,message = "年龄不能小于{value}")
    private Integer age;
}

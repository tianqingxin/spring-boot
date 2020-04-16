package com.demo.manydatasource.ExceptionHandler;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description: 自定义异常
 * @create: 2020-03-31 10:19
 **/
@ControllerAdvice
public class DefinedExceptionHanlder {

    @ExceptionHandler({RuntimeException.class})
    @ResponseBody
    public JSONObject exceptionHandler(){
        JSONObject jsonObject =new JSONObject();
        jsonObject.put("resCode","500");
        jsonObject.put("resMsg","系统错误");
        return jsonObject;
    }
}

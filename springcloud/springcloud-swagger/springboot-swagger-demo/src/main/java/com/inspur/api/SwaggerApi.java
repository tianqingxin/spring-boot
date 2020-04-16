package com.inspur.api;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @create: 2020-04-09 18:54
 **/
@Api(tags = {"这里写接口说明1"})
@RestController
public class SwaggerApi {

    @ApiOperation(value = "查询用户名信息",notes = "查询用户名信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userName",value = "用户名",dataType = "String",required = true)
    })
    @PostMapping("/getStr/{userName}")
    public String getStr(@PathVariable("userName") String userName){
        return "1sddsa"+userName;
    }
}

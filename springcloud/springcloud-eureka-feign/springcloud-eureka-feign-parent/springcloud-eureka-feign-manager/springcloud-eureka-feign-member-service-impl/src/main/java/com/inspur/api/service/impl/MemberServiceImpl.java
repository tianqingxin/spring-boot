package com.inspur.api.service.impl;
import com.inspur.api.service.member.IMemberService;
import com.inspur.api.util.EntityUtil;
import com.inspur.base.BaseApiService;
import com.inspur.base.ResponseBase;
import com.inspur.entity.member.MemberEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @description: 会员接口的实现类
 * @create: 2020-04-05 23:45
 **/
@Api("会员项目API")
@RestController
public class MemberServiceImpl extends BaseApiService implements IMemberService {

//    @Value("${server.port}")
//    private String serverPort;

    @Autowired
    private EntityUtil entityUtil;
    @ApiOperation(value = "获取会员信息",notes = "获取会员信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name",value = "名称",required = true,dataType = "String"),
            @ApiImplicitParam(name = "age",value = "年龄",required = true,dataType = "Integer")
    })
    @PostMapping("/getMember/{name}/{age}")
    public MemberEntity getMember(@PathVariable("name") String name, @PathVariable("age") Integer age) {
        return new MemberEntity(name, age);
    }

    @ApiOperation(value = "获取会员信息",notes = "获取会员信息")
    @ApiImplicitParams({
//            @ApiImplicitParam(name = "")
    })
    @GetMapping("/getMemberInfo")
    public ResponseBase getMemberInfo() {
       try {
           Thread.sleep(1500);
       } catch (Exception e) {
           e.printStackTrace();
       } finally {

       }
        return setResultSuccess("success from member...");
    }

    @RequestMapping("/")
    public String getStr(){
        return "member调用成功!!!,端口号："+ entityUtil.getServerPort();
    }
}

package com.zking.ssm.controller.base;
/*
@author yani
@create 2019-12-159:41
*/

import com.zking.ssm.util.DataProtocol;
import com.zking.ssm.util.ImageSms;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresGuest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/base")
public class baseController {

    /**
     *redis模板
     */
    @Autowired(required = false)
    private RedisTemplate redisTemplate;

    /**
     * 生成验证码图片
     * @param req
     * @param resp
     * @return
     * @throws IOException
     */
    @GetMapping("verificationCode")
    @RequiresGuest
    @ApiOperation(value = "生成图片验证码", notes = "生成登录的时候的图片验证码，验证码格式是base64字符串")
    public Object verificationCode(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        DataProtocol data=new DataProtocol();
        ImageSms vCode = new ImageSms(160,40,5,300);//优化
        String d=new Date().getTime()+".png";//优化
//        String path="C:/apache-tomcat-8.0.46/image/"+d;//优化
//        vCode.write(path);
        Map<String,String> map=new HashMap<>();
        //String p="/static/img/"+d;
        //http://localhost:8080/image/g(1)1.jpg
        String p="http://localhost:8080/image/"+d;
        map.put("path",p);
        map.put("yzm",vCode.getCode());
        data.setData(map);
        data.setCode(data.SUCCESS);
        data.setMessage("操作成功");
        return data;
    }
}

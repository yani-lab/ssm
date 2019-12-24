package com.zking.ssm.controller.info;
/*
@author yani
@create 2019-12-1216:02
*/

import com.zking.ssm.model.info.TRealauth;
import com.zking.ssm.service.info.IRealauthService;
import com.zking.ssm.util.DataProtocol;
import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/realauth")
public class TRealauthController {
    @Resource
    private IRealauthService realauthService;
    @RequestMapping("/RealauthInfo")
    public Object RealauthInfo(TRealauth realauth) {
        DataProtocol obj = new DataProtocol();

        int real=realauthService.addRealauth(realauth);
        if(real>=0){
            obj.setCode(DataProtocol.SUCCESS);
            obj.setMessage("认证成功");
        }else{
            obj.setCode(DataProtocol.FAIL);
            obj.setMessage("认证失败");
        }
        return obj;

    }


}

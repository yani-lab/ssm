package com.zking.ssm.controller.info;
/*
@author yani
@create 2019-12-1215:52
*/

import com.zking.ssm.model.info.TBidrequest;
import com.zking.ssm.service.info.IBidrequestService;
import com.zking.ssm.util.DataProtocol;
import com.zking.ssm.util.PageBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/tBidrequest")
public class TBidrequestController {

    @Resource
    private IBidrequestService bidrequestService;

//    @RequestMapping("/listTBidrequest")
//    public Object  listTBidrequest(TBidrequest tBidrequest) {
//        //转化字符串的帮助类
//        DataProtocol data = new DataProtocol();
//        List<TBidrequest> tb = bidrequestService.listTBidrequest(tBidrequest);
//        if(tb != null){
//            data.setCode(data.SUCCESS);
//            data.setMessage("操作成功");
//            data.setData(tb);
//            return data;
//        }
//        else {
//            data.setCode(data.FAIL);
//            data.setMessage("操作失败");
//            return data;
//        }
//
//
//    }
    @RequestMapping("/listTBidrequestPage")
    public Object listTBidrequestPage(TBidrequest tBidrequest, PageBean pageBean){
        DataProtocol data = new DataProtocol();
        List<TBidrequest> tb = bidrequestService.listTBidrequestPage(tBidrequest,pageBean);
        if(tb != null){
            data.setCode(data.SUCCESS);
            data.setMessage("操作成功");
            data.setData(tb);
            return data;
        }
        else {
            data.setCode(data.FAIL);
            data.setMessage("操作失败");
            return data;
        }


    }

    /**
     * 查询所有产品类型
     * @param bidrequesttype
     * @return
     */
    @RequestMapping("/getbidRequestTypeAll")
    public Object getbidRequestTypeAll(TBidrequest bidrequesttype){
        DataProtocol data = new DataProtocol();
        List<TBidrequest> tb = bidrequestService.getbidRequestTypeAll(bidrequesttype);
        if(tb != null){
            data.setCode(data.SUCCESS);
            data.setMessage("操作成功");
            data.setData(tb);
            return data;
        }
        else {
            data.setCode(data.FAIL);
            data.setMessage("操作失败");
            return data;
        }

    }







}

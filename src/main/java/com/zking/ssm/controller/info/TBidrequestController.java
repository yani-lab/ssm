package com.zking.ssm.controller.info;

import com.zking.ssm.mapper.sys.TSysTemdictionaryitemMapper;
import com.zking.ssm.model.info.TAccountflow;
import com.zking.ssm.model.info.TBidrequest;
import com.zking.ssm.model.sys.TSysTemdictionaryitem;
import com.zking.ssm.service.info.IBidrequestService;
import com.zking.ssm.service.sys.ISysTemdictionaryitemService;
import com.zking.ssm.util.DataProtocol;
import com.zking.ssm.util.PageBean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/*
@author yani
@create 2019-12-1215:52
*/
@RestController
@RequestMapping("/Bidrequest")
public class TBidrequestController {
    @Resource
    private IBidrequestService bidrequestService;
    @Resource
    private ISysTemdictionaryitemService tSysTemdictionaryitemService;
    @RequestMapping("/SelectBidrequestpaging")
    public Object SelectBidrequestpaging(HttpServletRequest request, TBidrequest bidrequest){

        DataProtocol data = new DataProtocol();

        PageBean pageBean=new PageBean();
        pageBean.setRequest(request);

        List<TBidrequest> lst=bidrequestService.sellctBidRequest(bidrequest,pageBean);

        if(lst!=null){
            for(TBidrequest b:lst){
                TSysTemdictionaryitem tt=new TSysTemdictionaryitem();
                tt.setSysfiId(b.getReturnType());
                TSysTemdictionaryitem tSysTemdictionaryitem= tSysTemdictionaryitemService.selectTitle(tt);
                b.setStateName(tSysTemdictionaryitem.getTitle());
            }
            data.setCode(DataProtocol.SUCCESS);
            data.setMessage("操作成功");
        }else{
            data.setCode(DataProtocol.FAIL);
            data.setMessage("操作失败");
        }

        data.setData(lst);
        return data;
    }
}

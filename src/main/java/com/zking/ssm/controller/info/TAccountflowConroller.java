package com.zking.ssm.controller.info;

import com.zking.ssm.model.info.TAccountflow;
import com.zking.ssm.service.info.IAccountService;
import com.zking.ssm.service.info.IAccountflowService;
import com.zking.ssm.util.DataProtocol;
import com.zking.ssm.util.PageBean;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
@author yani
@create 2019-12-1215:51
*/
@RestController
@RequestMapping("/flowAccount")
public class TAccountflowConroller {
    @Resource
    private IAccountflowService accountflowService;

    @RequestMapping("/SelectRecordpaging")
    public Object SelectRecordpaging(HttpServletRequest request, TAccountflow accountflow){
        DataProtocol data = new DataProtocol();

        PageBean pageBean=new PageBean();
        pageBean.setRequest(request);
        List<TAccountflow> lst=accountflowService.AllRecordpaging(accountflow,pageBean);
       if(lst!=null){
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

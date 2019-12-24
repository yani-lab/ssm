package com.zking.ssm.controller.info;

import com.zking.ssm.model.info.TRepayment;
import com.zking.ssm.service.info.IRepaymentService;
import com.zking.ssm.util.DataProtocol;
import com.zking.ssm.util.PageBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/*
@author yani
@create 2019-12-1216:03
*/
@RestController
@RequestMapping("/repayment")
public class TRepaymentController {
    @Resource
    private IRepaymentService repaymentService;

    @RequestMapping("/repayMoney")
    public Object repayMoney(TRepayment repayment) {
        DataProtocol data = new DataProtocol();
        int f = repaymentService.updateRepayment(repayment);
        if (f >= 1) {
            data.setCode(DataProtocol.SUCCESS);
            data.setMessage("还款成功");
        } else {
            data.setCode(DataProtocol.FAIL);
            data.setMessage("还款失败");
        }
        return data;
    }

    @RequestMapping("/AllRepaymen")
    public Object AllRepaymen(HttpServletRequest request, TRepayment repayment) {
        DataProtocol data = new DataProtocol();
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);
        List<TRepayment> rep = repaymentService.selectRepayment(repayment, pageBean);
        if (rep != null) {
            data.setCode(DataProtocol.SUCCESS);
            data.setMessage("操作成功");
        } else {
            data.setCode(DataProtocol.FAIL);
            data.setMessage("操作失败");
        }
        data.setData(rep);
        return data;
    }
}

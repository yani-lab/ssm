package com.zking.ssm.service.info;
/*
@author yani
@create 2019-12-1216:20
*/

import com.zking.ssm.model.info.TBidrequest;
import com.zking.ssm.util.PageBean;

import java.util.List;

public interface IBidrequestService {

    /**
     * 查询借款
     * @param tBidrequest
     * @return
     */
    List<TBidrequest> listTBidrequest(TBidrequest tBidrequest);


    List<TBidrequest> listTBidrequestPage(TBidrequest tBidrequest, PageBean pageBean);


    /**
     * 获取所有的产品类型
     * @param bidrequesttype
     * @return
     */
    List<TBidrequest> getbidRequestTypeAll(TBidrequest bidrequesttype);



}

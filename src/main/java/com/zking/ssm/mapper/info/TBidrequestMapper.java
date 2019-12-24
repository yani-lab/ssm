package com.zking.ssm.mapper.info;

import com.zking.ssm.model.info.TBidrequest;

import java.util.List;

/**
 * @author luo
 * @company zking
 * @creat 2019-12-1216:19
 */
public interface TBidrequestMapper {
    /**
     * 借款
     * @param tBidrequest
     * @return
     */
    List<TBidrequest> listTBidrequest(TBidrequest tBidrequest);




    List<TBidrequest> listTBidrequestPage(TBidrequest tBidrequest);


    /**
     * 获取所有的产品类型
     *
     */
   List<TBidrequest> getbidRequestTypeAll(TBidrequest bidrequesttype);


















}

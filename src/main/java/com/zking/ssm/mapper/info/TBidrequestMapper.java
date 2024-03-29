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
     * 查询所有借款项目
     * @param bidrequest
     * @return
     */
    List<TBidrequest> sellctBidRequest(TBidrequest bidrequest);

    List<TBidrequest> listTBidrequestPage(TBidrequest tBidrequest);
    /**
     * 修改借款表的id
     */
    int updatebid(TBidrequest tBidrequest);


    /**
     * 获取所有的产品类型
     *
     */
   List<TBidrequest> getbidRequestTypeAll(TBidrequest bidrequesttype);


















}

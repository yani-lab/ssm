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
}

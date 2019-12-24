package com.zking.ssm.service.infoimpl;
/*
@author yani
@create 2019-12-1216:20
*/

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.ssm.mapper.info.TBidrequestMapper;
import com.zking.ssm.mapper.sys.TSysTemdictionaryitemMapper;
import com.zking.ssm.model.info.TAccountflow;
import com.zking.ssm.model.info.TBidrequest;
import com.zking.ssm.model.sys.TSysTemdictionaryitem;
import com.zking.ssm.mapper.info.TBidrequestMapper;
import com.zking.ssm.model.info.TBidrequest;
import com.zking.ssm.service.info.IBidrequestService;
import com.zking.ssm.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class IBidrequestServiceImpl implements IBidrequestService {
    @Resource
    private TBidrequestMapper bidrequestMapper;
    @Override
    public List<TBidrequest> sellctBidRequest(TBidrequest bidrequest, PageBean pageBean) {
        if(pageBean!=null && pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }
        List<TBidrequest> list=bidrequestMapper.sellctBidRequest(bidrequest);

        if(pageBean!=null && pageBean.isPagination()){
            PageInfo pageInfo=new PageInfo(list);
            pageBean.setTotal(Long.valueOf(pageInfo.getTotal()).intValue());
        }
        return list;
    }

   @Resource
   private TBidrequestMapper tBidrequestMapper;

    @Override
    public List<TBidrequest> listTBidrequest(TBidrequest tBidrequest) {
        return tBidrequestMapper.listTBidrequest(tBidrequest);
    }

    @Override
    public List<TBidrequest> listTBidrequestPage(TBidrequest tBidrequest, PageBean pageBean) {
        return tBidrequestMapper.listTBidrequestPage(tBidrequest);
    }

    @Override
    public List<TBidrequest> getbidRequestTypeAll(TBidrequest bidrequesttype) {
        return tBidrequestMapper.getbidRequestTypeAll(bidrequesttype);
    }
}

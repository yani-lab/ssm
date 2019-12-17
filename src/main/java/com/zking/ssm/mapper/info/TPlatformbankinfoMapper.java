package com.zking.ssm.mapper.info;

import com.zking.ssm.model.info.TPlatformbankinfo;

import java.util.List;

/**
 * @author luo
 * @company zking
 * @creat 2019-12-1216:24
 */
public interface TPlatformbankinfoMapper {
    /**
     * 新增银行卡
     * @param platformbankinfo
     * @return
     */
    int addBank(TPlatformbankinfo platformbankinfo);
    List<TPlatformbankinfo> selectBank(TPlatformbankinfo platformbankinfo);
}

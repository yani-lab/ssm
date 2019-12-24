package com.zking.ssm.service.infoimpl;
/*
@author yani
@create 2019-12-1216:30
*/

import com.zking.ssm.mapper.info.TRealauthMapper;
import com.zking.ssm.mapper.info.TUserinfoMapper;
import com.zking.ssm.model.info.TRealauth;
import com.zking.ssm.model.info.TUserinfo;
import com.zking.ssm.service.info.IRealauthService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class IRealauthServiceImpl implements IRealauthService {
    @Resource
    private TRealauthMapper realauthMapper;
    @Resource
    private TUserinfoMapper userinfoMapper;
    @Override
    public int addRealauth(TRealauth realauth) {
        realauth.setRemark("未审核");
        DateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String time = format.format(new Date());
        Date d = null;
        try {
            d = format.parse(time);
            realauth.setApplyTime(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int r=realauthMapper.addRealauth(realauth);
        if(r>=1){
            TUserinfo user=new TUserinfo();
            user.setRealAuthId(realauth.getRealId());
            user.setUserId(realauth.getApplierId());
            userinfoMapper.updateRealauthId(user);
        }
        return r;
    }
}

package com.zking.ssm.util;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 环绕通知处理分页
 */
@Component
@Aspect
public class PagingInterceptor {

    @Around(value = "execution(* *..*Service.*paging(..))")
    public Object paging(ProceedingJoinPoint point) throws Throwable {
        Object[] args = point.getArgs();
        PageBean pageBean=null;
        for(Object arg:args){
            if(arg instanceof  PageBean){
                //如果他的类型是pagebean
                pageBean=(PageBean)arg;
            }
        }
            if(pageBean!=null && pageBean.isPagination()){
                PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
            }

            Object rv=point.proceed();

            if(pageBean != null && pageBean.isPagination()){
                PageInfo pageinfo=new PageInfo((List)rv);
                pageBean.setTotal(Long.valueOf(pageinfo.getTotal()).intValue());
            }
        return rv;
    }

}

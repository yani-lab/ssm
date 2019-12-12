package com.zking.ssm.util;

import java.util.HashMap;
import java.util.Map;

public class DataProtocol extends HashMap<String,Object> {
    public static int SUCCESS=1;
    public static int FAIL=-1;
    private long ts=System.currentTimeMillis();
    public DataProtocol(){
        super();
        this.put("code",SUCCESS);
        this.put("ts",ts);
        this.put("message","操作成功");
    }
    public void setCode(int code){
        //存放状态
        this.put("code",code);
    }
    public void setData(Object data){
        //存放业务数据
        this.put("data",data);
    }
    public void setErrors(Map<String,String> errors){
        //存放错误信息
        this.put("errors",errors);
    }
    public void setMessage(String message){
        //存放提示信息
        this.put("message",message);
    }


}

package com.dragon.util;


import com.dragon.handler.ResultCode;
import com.dragon.handler.ResultInfo;

public class ResultUtil {
    public ResultUtil(){}

    public static ResultInfo getSuccessResult(Object data){
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(ResultCode.SUCCESS.getCode());
        resultInfo.setMassage(ResultCode.SUCCESS.getMessage());
        resultInfo.setData(data);
        return  resultInfo;
    }

    public static ResultInfo getFailResult(String  resultCode,String message,Object data){
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(resultCode);
        resultInfo.setMassage(message);
        resultInfo.setData(data);
        return  resultInfo;
    }
    public static ResultInfo getFailResult(ResultCode  resultCode,Object data){
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(resultCode.getCode());
        resultInfo.setMassage(resultCode.getMessage());
        resultInfo.setData(data);
        return  resultInfo;
    }
}

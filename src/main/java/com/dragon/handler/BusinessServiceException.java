package com.dragon.handler;

public class BusinessServiceException extends Exception {

    private String resultCode;

    public  BusinessServiceException(String message){
        super(message);
    }

    public  BusinessServiceException(Exception e){
        super(e);
    }
    public BusinessServiceException(String resultCode,String message){
        super(message);
        this.resultCode = resultCode;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }
}

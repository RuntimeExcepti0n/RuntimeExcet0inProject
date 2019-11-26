package com.dragon.handler;

public enum  ResultCode {

    SUCCESS("000000","成功"),
    CONNECT_ERROR("100001","网络连接错误"),
    CONNECT_TIMEOOUT("100002","网络连接超时"),
    INTERNAL_SERVER_ERROR("100003","服务器内部错误"),
    NO_SUPPORT_REQUEST_ERROR("100004","服务器不支持当前请求"),
    GETWAY_ERROR("100005","网关错误"),
    UNABLE_HANDLER_REQUEST_ERROR("000000","服务器无法处理当前请求"),
    PARAMER_ERROR("200005","参数格式异常"),
    UNKNOWN_ERROR("000500","未知错误");

    private String code;
    private String message;

    ResultCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

package com.bohai.fofsystem.bean;

import com.bohai.fofsystem.exception.ErrorConstant;

/**
 * Created by cxy on 2018/11/29
 */
public class ReturnHeader {
    private String errorCode=ErrorConstant.SUCCESS.getErrorCode();
    private String errorMsg=ErrorConstant.SUCCESS.getErrorMsg();

    public ReturnHeader(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public ReturnHeader() {
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public String toString() {
        return "ResponseHeader{" +
                "errorCode='" + errorCode + '\'' +
                ", errorMsg='" + errorMsg + '\'' +
                '}';
    }
}

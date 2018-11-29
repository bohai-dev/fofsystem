package com.bohai.fofsystem.exception;

/**
 * Created by cxy on 2018/11/6
 */
public class FofException extends Exception {

    private String errorCode;
    private String errorMsg;

    public FofException(ErrorConstant errorConstant) {

        this.errorCode=errorConstant.getErrorCode();
        this.errorMsg=errorConstant.getErrorMsg();
    }

    public FofException(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
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
}

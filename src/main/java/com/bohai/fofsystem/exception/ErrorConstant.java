package com.bohai.fofsystem.exception;

/**
 * Created by cxy on 2018/11/6
 */
public enum ErrorConstant {


    SUCCESS("0000","ok"),
    PARAMS_VALIDATE_ERROR("0001","数据校验失败"),
    ID_NOT_EXISTS_ERROR("0002","id不能为空"),






    UNKNOW_EXCEPTION("1000", "程序内部异常");

    private String errorCode;
    private String errorMsg;

    ErrorConstant(String errorCode, String errorMsg) {
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

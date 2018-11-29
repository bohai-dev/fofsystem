package com.bohai.fofsystem.bean;

public class ReturnBody<T> extends ReturnHeader{
    
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    
}

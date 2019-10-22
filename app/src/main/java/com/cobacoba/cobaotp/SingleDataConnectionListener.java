package com.cobacoba.cobaotp;

public interface SingleDataConnectionListener<T>{

    void onSuccess(T data,String message);
    void onFailed(String message);

}

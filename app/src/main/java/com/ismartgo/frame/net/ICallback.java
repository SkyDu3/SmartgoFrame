package com.ismartgo.frame.net;

/**
 * 请求结果回调接口
 * @param <T>
 */
public interface ICallback<T> {
    /**
     * 请求成功回调
     * @param result
     */
    void onSuccess(T result);

    /**
     * 请求失败回调
     * @param code
     * @param throwable
     */
    void onFailure(int code,Throwable throwable);
}

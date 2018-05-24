package com.ismartgo.frame.net;

import java.util.Map;

public interface HttpRequest {
    /**
     * get请求方式
     * @param url
     * @param params
     */
    void get(String url, Map<String,String> params);
}

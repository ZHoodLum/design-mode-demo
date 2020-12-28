package com.springmvc.interceptingfilterpattern.client;

import com.springmvc.interceptingfilterpattern.filter.impl.FilterManager;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/13
 * @Description:
 */


public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    //客户端  向过滤器   发送请求
    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}

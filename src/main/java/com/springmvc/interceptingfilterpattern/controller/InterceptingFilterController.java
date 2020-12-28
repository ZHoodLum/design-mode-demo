package com.springmvc.interceptingfilterpattern.controller;

import com.springmvc.interceptingfilterpattern.client.Client;
import com.springmvc.interceptingfilterpattern.filter.impl.AuthenticationFilter;
import com.springmvc.interceptingfilterpattern.filter.impl.DebugFilter;
import com.springmvc.interceptingfilterpattern.filter.impl.FilterManager;
import com.springmvc.interceptingfilterpattern.target.Target;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/13
 * @Description:模拟请求
 */


public class InterceptingFilterController {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        //相当于初始过滤器 init
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);

        //开始发送请求
        client.sendRequest("HOME");
    }
}

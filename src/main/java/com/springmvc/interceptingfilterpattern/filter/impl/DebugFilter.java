package com.springmvc.interceptingfilterpattern.filter.impl;

import com.springmvc.interceptingfilterpattern.filter.Filter;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/13
 * @Description:创建实体过滤器。
 */


public class DebugFilter implements Filter {
    @Override
    public void execute(String request){
        System.out.println("日志处理——request log: " + request);
    }
}
package com.springmvc.interceptingfilterpattern.filter;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/13
 * @Description:创建过滤器接口 Filter。
 */


public interface Filter {
    public void execute(String request);
}

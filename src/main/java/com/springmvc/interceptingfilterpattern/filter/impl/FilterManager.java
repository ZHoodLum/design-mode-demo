package com.springmvc.interceptingfilterpattern.filter.impl;

import com.springmvc.interceptingfilterpattern.filter.Filter;
import com.springmvc.interceptingfilterpattern.target.Target;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/13
 * @Description:创建过滤管理器。
 */


public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    //过滤器链  处理i请求
    public void filterRequest(String request){
        filterChain.execute(request);
    }
}

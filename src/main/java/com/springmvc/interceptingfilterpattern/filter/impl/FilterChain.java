package com.springmvc.interceptingfilterpattern.filter.impl;

import com.springmvc.interceptingfilterpattern.filter.Filter;
import com.springmvc.interceptingfilterpattern.target.Target;

import java.util.ArrayList;
import java.util.List;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/13
 * @Description:创建过滤器链。
 */


public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
    private Target target;

    //过滤器链
    public void addFilter(Filter filter){
        filters.add(filter);
    }

    //处理请求
    public void execute(String request){
        for (Filter filter : filters) {
            //过滤 权限认证  日志i处理等操作
            filter.execute(request);
        }

        //请i去过滤后，开始对请求进行逻辑处理  类似以action  service
        target.execute(request);
    }

    public void setTarget(Target target){
        this.target = target;
    }
}

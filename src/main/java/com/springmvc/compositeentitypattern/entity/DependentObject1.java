package com.springmvc.compositeentitypattern.entity;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/13
 * @Description:创建依赖对象。
 */


public class DependentObject1 {
    private String data;

    public void setData(String data){
        this.data = data;
    }

    public String getData(){
        return data;
    }
}

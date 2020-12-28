package com.springmvc.interceptingfilterpattern.target;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/13
 * @Description:
 */


public class Target {
    //A和action一个性质    类似于逻辑处理
    public void execute(String request){
        System.out.println("冲啊Executing request: " + request);
    }
}

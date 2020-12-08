package com.action.chainofresponsibilitypattern.demo2.serviceImpl;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/25
 * @Description:
 */


public class Request {
    Level level;
    public Request(Level level){
        this.level = level;
    }

    public Level getLevel(){
        return level;
    }
}

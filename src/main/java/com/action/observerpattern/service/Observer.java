package com.action.observerpattern.service;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/26
 * @Description:
 */


public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}

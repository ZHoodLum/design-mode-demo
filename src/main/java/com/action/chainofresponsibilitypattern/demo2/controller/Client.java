package com.action.chainofresponsibilitypattern.demo2.controller;

import com.action.chainofresponsibilitypattern.demo2.serviceImpl.Level;
import com.action.chainofresponsibilitypattern.demo2.serviceImpl.Request;
import com.action.chainofresponsibilitypattern.demo2.serviceImpl.Response;
import com.action.chainofresponsibilitypattern.demo2.utils.Handler;
import com.action.chainofresponsibilitypattern.demo2.utils.impl.ConcreteHandler1;
import com.action.chainofresponsibilitypattern.demo2.utils.impl.ConcreteHandler2;
import com.action.chainofresponsibilitypattern.demo2.utils.impl.ConcreteHandler3;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/25
 * @Description:
 */


public class Client {
    public static void main(String[] args){
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        Response response = handler1.handleRequest(new Request(new Level(1)));
    }
}

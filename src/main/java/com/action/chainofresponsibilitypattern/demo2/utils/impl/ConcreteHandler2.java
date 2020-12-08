package com.action.chainofresponsibilitypattern.demo2.utils.impl;

import com.action.chainofresponsibilitypattern.demo2.serviceImpl.Level;
import com.action.chainofresponsibilitypattern.demo2.serviceImpl.Request;
import com.action.chainofresponsibilitypattern.demo2.serviceImpl.Response;
import com.action.chainofresponsibilitypattern.demo2.utils.Handler;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/25
 * @Description:
 */


public class ConcreteHandler2 extends Handler {
    @Override
    protected Level getHandlerLevel() {
        return new Level(2);
    }

    @Override
    public Response response(Request request) {
        System.out.println("-----请求由处理器2进行处理-----");
        return null;
    }
}
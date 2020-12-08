package com.action.chainofresponsibilitypattern.demo2.utils;

import com.action.chainofresponsibilitypattern.demo2.serviceImpl.Level;
import com.action.chainofresponsibilitypattern.demo2.serviceImpl.Request;
import com.action.chainofresponsibilitypattern.demo2.serviceImpl.Response;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/25
 * @Description:
 */


public abstract class Handler {
    protected abstract Level getHandlerLevel();

    public abstract Response response(Request request);

    private Handler nextHandler;

    public final Response handleRequest(Request request) {
        Response response = null;

        if (this.getHandlerLevel().above(request.getLevel())) {
            response = this.response(request);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.handleRequest(request);
            } else {
                System.out.println("-----没有合适的处理器-----");
            }
        }
        return response;
    }

    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

}

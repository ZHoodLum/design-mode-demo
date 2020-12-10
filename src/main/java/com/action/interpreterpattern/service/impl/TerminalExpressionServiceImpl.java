package com.action.interpreterpattern.service.impl;

import com.action.interpreterpattern.service.ExpressionService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/26
 * @Description:
 */


public class TerminalExpressionServiceImpl implements ExpressionService {
    private String data;

    public TerminalExpressionServiceImpl(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}

package com.action.interpreterpattern.service.impl;

import com.action.interpreterpattern.service.ExpressionService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/26
 * @Description:
 */


public class AndExpressionServiceImpl implements ExpressionService {
    private ExpressionService expr1 = null;
    private ExpressionService expr2 = null;

    public AndExpressionServiceImpl(ExpressionService expr1, ExpressionService expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
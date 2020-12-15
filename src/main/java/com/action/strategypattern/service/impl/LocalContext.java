package com.action.strategypattern.service.impl;

import com.action.strategypattern.service.Strategy;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/11
 * @Description:
 */


public class LocalContext {
    private Strategy strategy;

    public LocalContext(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}

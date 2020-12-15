package com.action.strategypattern.service.impl;

import com.action.strategypattern.service.Strategy;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/11
 * @Description:
 */


public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}

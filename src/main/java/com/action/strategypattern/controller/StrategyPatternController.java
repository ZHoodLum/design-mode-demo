package com.action.strategypattern.controller;

import com.action.strategypattern.service.impl.LocalContext;
import com.action.strategypattern.service.impl.OperationAdd;
import com.action.strategypattern.service.impl.OperationMultiply;
import com.action.strategypattern.service.impl.OperationSubstract;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/11
 * @Description:可以跟工厂类进行对比  原理是一样得
 */


public class StrategyPatternController {
    public static void main(String[] args) {
        LocalContext context = new LocalContext(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new LocalContext(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new LocalContext(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}

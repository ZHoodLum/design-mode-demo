package com.action.statepattern.controller;

import com.action.statepattern.service.impl.Context;
import com.action.statepattern.service.impl.StartState;
import com.action.statepattern.service.impl.StopState;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/26
 * @Description:
 */


public class StatePatternController {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}

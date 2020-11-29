package com.action.statepattern.service.impl;

import com.action.statepattern.service.State;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/26
 * @Description:
 */


public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Start State";
    }
}

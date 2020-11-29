package com.action.statepattern.service.impl;

import com.action.statepattern.service.State;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/26
 * @Description:
 */


public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}

package com.action.mementopattern.service;

import java.util.Map;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/11
 * @Description:
 */


public class Memento {
    private Map stateMap;

    public Memento(Map map) {
        this.stateMap = map;
    }

    public Map getStateMap() {
        return stateMap;
    }

    public void setStateMap(Map stateMap) {
        this.stateMap = stateMap;
    }
}

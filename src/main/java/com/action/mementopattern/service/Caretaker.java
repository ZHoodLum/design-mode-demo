package com.action.mementopattern.service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/11
 * @Description:
 */


public class Caretaker {
    private Map memMap = new HashMap();
    public Memento getMemento(String index){
        return (Memento) memMap.get(index);
    }

    public void setMemento(String index, Memento memento){
        this.memMap.put(index, memento);
    }
}

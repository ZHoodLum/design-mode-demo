package com.action.mementopattern.controller;

import com.action.mementopattern.service.Caretaker;
import com.action.mementopattern.service.Originator;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/11
 * @Description:
 */


public class Client {
    public static void main(String[] args){
        Originator ori = new Originator();
        Caretaker caretaker = new Caretaker();
        ori.setState1("中国");
        ori.setState2("强盛");
        ori.setState3("繁荣");
        System.out.println("===初始化状态===n"+ori);

        caretaker.setMemento("001",ori.createMemento());
        ori.setState1("软件");
        ori.setState2("架构");
        ori.setState3("优秀");
        System.out.println("===修改后状态===n"+ori);

        ori.restoreMemento(caretaker.getMemento("001"));
        System.out.println("===恢复后状态===n"+ori);
    }
}

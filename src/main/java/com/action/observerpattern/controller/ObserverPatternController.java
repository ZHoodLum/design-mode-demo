package com.action.observerpattern.controller;

import com.action.observerpattern.service.Subject;
import com.action.observerpattern.service.impl.BinaryObserver;
import com.action.observerpattern.service.impl.HexaObserver;
import com.action.observerpattern.service.impl.OctalObserver;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/26
 * @Description:
 */


public class ObserverPatternController {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}

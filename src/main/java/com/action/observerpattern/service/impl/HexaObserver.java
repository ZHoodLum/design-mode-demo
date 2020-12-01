package com.action.observerpattern.service.impl;

import com.action.observerpattern.service.Observer;
import com.action.observerpattern.service.Subject;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/26
 * @Description:
 */


public class HexaObserver extends Observer {

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
package com.action.commandpattern.demo2.service.impl;

import com.action.commandpattern.demo2.provider.Receiver;
import com.action.commandpattern.demo2.service.CommandService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/25
 * @Description:
 */


public class ConcreteCommandServiceImpl extends CommandService {
    private Receiver receiver;

    public ConcreteCommandServiceImpl(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}

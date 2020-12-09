package com.action.commandpattern.demo2.controller;

import com.action.commandpattern.demo2.consumer.Invoker;
import com.action.commandpattern.demo2.provider.Receiver;
import com.action.commandpattern.demo2.service.CommandService;
import com.action.commandpattern.demo2.service.impl.ConcreteCommandServiceImpl;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/25
 * @Description:
 */


public class ClientController {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        CommandService command = new ConcreteCommandServiceImpl(receiver);
        //客户端直接执行具体命令方式（此方式与类图相符）
//        command.execute();

        //客户端通过调用者来执行命令
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.action();
    }
}

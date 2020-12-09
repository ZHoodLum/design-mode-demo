package com.action.commandpattern.demo2.consumer;

import com.action.commandpattern.demo2.service.CommandService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/25
 * @Description:
 */

public class Invoker {
    private CommandService command;

    public void setCommand(CommandService command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}

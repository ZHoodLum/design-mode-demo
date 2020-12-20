package com.action.vsitorpattern.service;

import com.action.vsitorpattern.service.impl.Computer;
import com.action.vsitorpattern.service.impl.Keyboard;
import com.action.vsitorpattern.service.impl.Monitor;
import com.action.vsitorpattern.service.impl.Mouse;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/11
 * @Description:
 */


public interface ComputerPartVisitor {
    public void visit(Computer computer);

    public void visit(Mouse mouse);

    public void visit(Keyboard keyboard);

    public void visit(Monitor monitor);
}

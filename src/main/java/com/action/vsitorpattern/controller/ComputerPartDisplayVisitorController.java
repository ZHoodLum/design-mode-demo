package com.action.vsitorpattern.controller;

import com.action.vsitorpattern.service.ComputerPartVisitor;
import com.action.vsitorpattern.service.impl.Computer;
import com.action.vsitorpattern.service.impl.Keyboard;
import com.action.vsitorpattern.service.impl.Monitor;
import com.action.vsitorpattern.service.impl.Mouse;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/11
 * @Description:
 */


public class ComputerPartDisplayVisitorController implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
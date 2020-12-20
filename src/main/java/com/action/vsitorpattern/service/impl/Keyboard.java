package com.action.vsitorpattern.service.impl;

import com.action.vsitorpattern.service.ComputerPart;
import com.action.vsitorpattern.service.ComputerPartVisitor;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/11
 * @Description:
 */


public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
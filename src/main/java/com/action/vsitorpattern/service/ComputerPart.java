package com.action.vsitorpattern.service;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/11
 * @Description:
 */


public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}

package com.action.nullobjectpattern.dome1.serivce.impl;

import com.action.nullobjectpattern.dome1.serivce.AbstractCustomer;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/1
 * @Description:
 */


public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public boolean isNil() {
        return false;
    }
}
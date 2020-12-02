package com.action.nullobjectpattern.dome1.serivce.impl;

import com.action.nullobjectpattern.dome1.serivce.AbstractCustomer;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/1
 * @Description:
 */


public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
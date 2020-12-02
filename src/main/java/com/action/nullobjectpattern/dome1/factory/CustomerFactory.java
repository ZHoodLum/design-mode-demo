package com.action.nullobjectpattern.dome1.factory;

import com.action.nullobjectpattern.dome1.serivce.AbstractCustomer;
import com.action.nullobjectpattern.dome1.serivce.impl.NullCustomer;
import com.action.nullobjectpattern.dome1.serivce.impl.RealCustomer;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/1
 * @Description:
 */


public class CustomerFactory {
    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}



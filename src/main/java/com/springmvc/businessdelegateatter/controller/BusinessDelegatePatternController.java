package com.springmvc.businessdelegateatter.controller;

import com.springmvc.businessdelegateatter.business.BusinessDelegate;
import com.springmvc.businessdelegateatter.client.Client;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/11
 * @Description:
 */


public class BusinessDelegatePatternController {
    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}

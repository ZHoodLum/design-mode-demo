package com.springmvc.businessdelegateatter.service.impl;

import com.springmvc.businessdelegateatter.service.BusinessService;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/11
 * @Description:
 */


public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
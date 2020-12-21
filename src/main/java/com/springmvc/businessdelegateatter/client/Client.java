package com.springmvc.businessdelegateatter.client;

import com.springmvc.businessdelegateatter.business.BusinessDelegate;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/11
 * @Description:
 */


public class Client {
    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
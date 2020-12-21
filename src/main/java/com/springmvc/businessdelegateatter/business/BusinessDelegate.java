package com.springmvc.businessdelegateatter.business;

import com.springmvc.businessdelegateatter.service.BusinessService;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/11
 * @Description:
 */


public class BusinessDelegate {
    private BusinessLookUp lookupService = new BusinessLookUp();

    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
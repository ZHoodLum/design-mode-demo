package com.springmvc.businessdelegateatter.business;

import com.springmvc.businessdelegateatter.service.BusinessService;
import com.springmvc.businessdelegateatter.service.impl.EJBService;
import com.springmvc.businessdelegateatter.service.impl.JMSService;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/11
 * @Description:
 */


public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}

package com.springmvc.servicelocatorpattern.locator;

import com.springmvc.servicelocatorpattern.cache.Cache;
import com.springmvc.servicelocatorpattern.context.InitialContext;
import com.springmvc.servicelocatorpattern.service.Service;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/13
 * @Description:服务定位器（Service Locator） - 服务定位器是通过 JNDI 查找和缓存服务来获取服务的单点接触。
 */


public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(String jndiName){

        Service service = cache.getService(jndiName);

        if(service != null){
            return service;
        }

        InitialContext context = new InitialContext();
        Service service1 = (Service)context.lookup(jndiName);
        cache.addService(service1);
        return service1;
    }
}

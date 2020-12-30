package com.springmvc.servicelocatorpattern.controller;

import com.springmvc.servicelocatorpattern.locator.ServiceLocator;
import com.springmvc.servicelocatorpattern.service.Service;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/13
 * @Description:
 */


public class ServiceLocatorPatternController {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}

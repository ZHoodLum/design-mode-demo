package com.springmvc.servicelocatorpattern.service.impl;


import com.springmvc.servicelocatorpattern.service.Service;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/13
 * @Description:服务（Service） - 实际处理请求的服务。对这种服务的引用可以在 JNDI 服务器中查找到。
 */


public class Service1 implements Service {
    @Override
    public void execute(){
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "Service1";
    }
}

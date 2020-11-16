package com.create.abstractfactorypattern.service.impl;


import com.create.abstractfactorypattern.service.HelloService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/12
 * @Description:create场景的实现类
 */


public class CreateHelloServiceImpl implements HelloService {


    @Override
    public void HelloWorld() {

        System.out.println("调用_ HelloWorld() method. ________你好！CreateServiceImpl");
        customMethod1();
    }

    /**
     * 自定义方法
     */
    public void customMethod1() {

        System.out.println("CreateServiceImpl中自定义方法____customMethod1");
        System.out.println( );
    }


}

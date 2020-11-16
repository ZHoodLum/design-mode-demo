package com.create.abstractfactorypattern.service.impl;


import com.create.abstractfactorypattern.service.HelloService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/12
 * @Description:read场景的实现类
 */


public class ReadHelloServiceImpl implements HelloService {


    @Override
    public void HelloWorld() {

        System.out.println("调用_ HelloWorld() method.  ________你好！ReadServiceImpl");
        customMethod3();
    }

    /**
     * 自定义方法
     */
    public void customMethod3() {

        System.out.println("ReadServiceImpl 中自定义方法____customMethod3");
        System.out.println( );
    }
}

package com.create.factorypattern.service.impl;


import com.create.factorypattern.service.FactoryInterfaceService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/12
 * @Description:update场景的实现类
 */


public class UpdateServiceImpl implements FactoryInterfaceService {


    @Override
    public void HelloWorld() {
        System.out.println("调用_ HelloWorld() method.  ________你好！UpdateServiceImpl");
        customMethod4();
    }

    /**
     * 自定义方法
     */
    public void customMethod4() {

        System.out.println("UpdateServiceImpl 中自定义方法____customMethod4");
        System.out.println( );
    }
}

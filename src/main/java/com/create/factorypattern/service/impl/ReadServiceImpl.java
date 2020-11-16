package com.create.factorypattern.service.impl;


import com.create.factorypattern.service.FactoryInterfaceService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/12
 * @Description:read场景的实现类
 */


public class ReadServiceImpl implements FactoryInterfaceService {


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

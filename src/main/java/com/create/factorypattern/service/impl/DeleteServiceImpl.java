package com.create.factorypattern.service.impl;


import com.create.factorypattern.service.FactoryInterfaceService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/12
 * @Description:delete场景的实现类
 */


public class DeleteServiceImpl implements FactoryInterfaceService {


    @Override
    public void HelloWorld() {

        System.out.println("调用_ HelloWorld() method.  ________你好！DeleteServiceImpl");
        customMethod2();
    }

    /**
     * 自定义方法
     */
    public void customMethod2() {

        System.out.println("DeleteServiceImpl 中自定义方法____customMethod2");
        System.out.println( );
    }


}

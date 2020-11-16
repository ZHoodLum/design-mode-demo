package com.create.abstractfactorypattern.service.impl;


import com.create.abstractfactorypattern.service.HelloService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/12
 * @Description:delete场景的实现类
 */


public class DeleteHelloServiceImpl implements HelloService {


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

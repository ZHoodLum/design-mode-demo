package com.create.abstractfactorypattern.controller;

import com.create.abstractfactorypattern.generatorfactory.FactoryProducts;
import com.create.abstractfactorypattern.factory.WestAbstractFactory;
import com.create.abstractfactorypattern.service.HelloService;
import com.create.abstractfactorypattern.service.SubscriberService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/12
 * @Description:使用 FactoryProducers 来获取 WestAbstractFactory，通过传递类型信息来获取实体类的对象。
 * 思想：类似于子类继承父类时，父类引用指向子类对象  生成对象（或者说类似于springboot中的@@Autowired注解）
 *
 * HelloFactory
 *  * CreateServiceImpl
 *  * DeleteServiceImpl
 *  * ReadServiceImpl
 *  * UpdateServiceImpl
 *
 * SubscriberFactory
 *   *PJLSubscriberServiceImpl
 *   *WDLSubscriberServiceImpl
 */

public class AbstractFactoryPatternController {

    public static void main(String[] args) {
        //通过管理工厂（WestAbstractFactory）的类实例化对应的工厂类（HelloFactory   /  SubscriberFactory）
        WestAbstractFactory HelloFactory = FactoryProducts.getFactory("HelloFactory");
        WestAbstractFactory SubscriberFactory = FactoryProducts.getFactory("SubscriberFactory");

        //实现类实现接口时  接口的引用指向实现类对象
        HelloService CreateServiceImpl = HelloFactory.getHello("CreateServiceImpl");
        //调用实现类CreateServiceImpl 的 HelloWorld 方法
        CreateServiceImpl.HelloWorld();

        HelloService DeleteServiceImpl = HelloFactory.getHello("DeleteServiceImpl");
        DeleteServiceImpl.HelloWorld();

        HelloService ReadServiceImpl = HelloFactory.getHello("ReadServiceImpl");
        ReadServiceImpl.HelloWorld();

        HelloService UpdateServiceImpl = HelloFactory.getHello("UpdateServiceImpl");
        UpdateServiceImpl.HelloWorld();

        System.out.println();

        SubscriberService PJLSubscriberServiceImpl = SubscriberFactory.getSubscriber("PJLSubscriberServiceImpl");
        PJLSubscriberServiceImpl.Subscriber();

        SubscriberService WDLSubscriberServiceImpl = SubscriberFactory.getSubscriber("WDLSubscriberServiceImpl");
        WDLSubscriberServiceImpl.Subscriber();
    }
}

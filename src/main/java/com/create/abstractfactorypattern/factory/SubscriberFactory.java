package com.create.abstractfactorypattern.factory;

import com.create.abstractfactorypattern.service.HelloService;
import com.create.abstractfactorypattern.service.SubscriberService;
import com.create.abstractfactorypattern.service.impl.*;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/12
 * @Description1:工厂类 存储用户工厂工具类,
 * @Description2:创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象。
 * SubscriberFactory
 */


public class SubscriberFactory extends WestAbstractFactory {

    @Override
    public HelloService getHello(String helloType) {
        return null;
    }

    /**
     * 使用 getHello 方法获取形状类型的对象
     * @param subscriberType 实现类名称
     * @return
     */
    @Override
    public SubscriberService getSubscriber(String subscriberType) {
        if(subscriberType == null){
            return null;
        }

        switch (subscriberType) {
            case "PJLSubscriberServiceImpl": return new PJLSubscriberServiceImpl();
            case "WDLSubscriberServiceImpl": return new WDLSubscriberServiceImpl();
        }
        return null;
    }
}

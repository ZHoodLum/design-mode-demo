package com.create.abstractfactorypattern.factory;

import com.create.abstractfactorypattern.service.HelloService;
import com.create.abstractfactorypattern.service.SubscriberService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/12
 * @Description:用来管理抽象工厂类 此工厂类即可以定义为抽象类页可以定义成接口  看个人理解
 * HelloFactory
 * SubscriberFactory
 */


public abstract class WestAbstractFactory {

    public abstract HelloService getHello(String helloType);

    public abstract SubscriberService getSubscriber(String subscriberType);
}

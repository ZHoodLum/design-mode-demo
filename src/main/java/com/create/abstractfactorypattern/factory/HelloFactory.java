package com.create.abstractfactorypattern.factory;

import com.create.abstractfactorypattern.service.HelloService;
import com.create.abstractfactorypattern.service.SubscriberService;
import com.create.abstractfactorypattern.service.impl.CreateHelloServiceImpl;
import com.create.abstractfactorypattern.service.impl.DeleteHelloServiceImpl;
import com.create.abstractfactorypattern.service.impl.ReadHelloServiceImpl;
import com.create.abstractfactorypattern.service.impl.UpdateHelloServiceImpl;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/12
 * @Description:工厂类 存储语言工厂工具类
 * @Description2:创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象。
 * HelloFactory
 */


public class HelloFactory extends WestAbstractFactory {

    /**
     * 使用 getHello 方法获取形状类型的对象
     * @param helloType 实现类名称
     * @return
     */
    @Override
    public HelloService getHello(String helloType) {
        if(helloType == null){
            return null;
        }

        switch (helloType) {
            case "CreateServiceImpl": return new CreateHelloServiceImpl();
            case "DeleteServiceImpl": return new DeleteHelloServiceImpl();
            case "ReadServiceImpl": return new ReadHelloServiceImpl();
            case "UpdateServiceImpl": return new UpdateHelloServiceImpl();
        }
        return null;
    }

    @Override
    public SubscriberService getSubscriber(String subscriberType) {
        return null;
    }
}

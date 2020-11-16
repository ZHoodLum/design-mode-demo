package com.create.abstractfactorypattern.generatorfactory;

import com.create.abstractfactorypattern.factory.HelloFactory;
import com.create.abstractfactorypattern.factory.SubscriberFactory;
import com.create.abstractfactorypattern.factory.WestAbstractFactory;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/12
 * @Description:创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂。
 * HelloFactory
 * SubscriberFactory
 */


public class FactoryProducts {

    /**
     * 根据getFactory获取当前工厂
     * @param choice
     * @return
     */
    public static WestAbstractFactory getFactory(String choice){
        if(choice == null){
            return null;
        }

        switch (choice) {
            case "HelloFactory": return new HelloFactory();
            case "SubscriberFactory": return new SubscriberFactory();
        }
        return null;
    }
}

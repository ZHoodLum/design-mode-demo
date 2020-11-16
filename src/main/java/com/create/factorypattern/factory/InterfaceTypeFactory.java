package com.create.factorypattern.factory;

import com.create.factorypattern.service.FactoryInterfaceService;
import com.create.factorypattern.service.impl.CreateServiceImpl;
import com.create.factorypattern.service.impl.DeleteServiceImpl;
import com.create.factorypattern.service.impl.ReadServiceImpl;
import com.create.factorypattern.service.impl.UpdateServiceImpl;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/12
 * @Description:工厂类 存储当前工厂工具类
 */


public class InterfaceTypeFactory {

    //使用 getShape 方法获取形状类型的对象
    public FactoryInterfaceService getShape(String shapeType){
        if(shapeType == null){
            return null;
        }

        switch (shapeType) {
            case "CreateServiceImpl": return new CreateServiceImpl();
            case "DeleteServiceImpl": return new DeleteServiceImpl();
            case "ReadServiceImpl": return new ReadServiceImpl();
            case "UpdateServiceImpl": return new UpdateServiceImpl();
        }
        return null;
    }

    public CreateServiceImpl impCreateServiceImpl() {
        return new CreateServiceImpl();
    }

}

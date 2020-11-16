package com.create.factorypattern.controller;

import com.create.factorypattern.factory.InterfaceTypeFactory;
import com.create.factorypattern.service.FactoryInterfaceService;
import com.create.factorypattern.service.impl.CreateServiceImpl;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/12
 * @Description:根据当前使用的实现类（impl下的实现类名称），来执行的对应的方法及实现类下的扩展方法
 * 应用场景：
 * 1、获取当前bean类
 * 2、一个接口供多个实现类使用时
 *
 * 方法  controller/action
 * CreateServiceImpl
 * DeleteServiceImpl
 * ReadServiceImpl
 * UpdateServiceImpl
 */


public class FactoryPatternController {

    public static void main(String[] args) {
        InterfaceTypeFactory interfaceTypeFactory = new InterfaceTypeFactory();

        InterfaceTypeFactory interfaceTypeFactory1 = new InterfaceTypeFactory();
        CreateServiceImpl createService = interfaceTypeFactory.impCreateServiceImpl();
        createService.HelloWorld();

        System.out.println("-----------");

        //获取 CreateServiceImpl 的对象，并调用它的 HelloWorld 方法
        FactoryInterfaceService CreateServiceImpl = interfaceTypeFactory.getShape("CreateServiceImpl");
        //调用 CreateServiceImpl 的 HelloWorld 方法
        CreateServiceImpl.HelloWorld();

        //获取 DeleteServiceImpl 的对象，并调用它的 HelloWorld 方法
        FactoryInterfaceService DeleteServiceImpl = interfaceTypeFactory.getShape("DeleteServiceImpl");
        //调用 DeleteServiceImpl 的 HelloWorld 方法
        DeleteServiceImpl.HelloWorld();

        //获取 ReadServiceImpl 的对象，并调用它的 HelloWorld 方法
        FactoryInterfaceService ReadServiceImpl = interfaceTypeFactory.getShape("ReadServiceImpl");
        //调用 ReadServiceImpl 的 HelloWorld 方法
        ReadServiceImpl.HelloWorld();

        //获取 UpdateServiceImpl 的对象，并调用它的 HelloWorld 方法
        FactoryInterfaceService UpdateServiceImpl = interfaceTypeFactory.getShape("UpdateServiceImpl");
        //调用 UpdateServiceImpl 的 HelloWorld 方法
        UpdateServiceImpl.HelloWorld();
    }
}

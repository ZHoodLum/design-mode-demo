package com.create.singletonpattern.controller;

import com.create.singletonpattern.service.MonkeySingle;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/13
 * @Description:单例模式
 */


public class SingletonPatternController {

    public static void main(String[] args) {
//        此时的monkey类已经是私有化的类  无法进行实例化操作
//        MonkeySingle monkeySingle = new MonkeySingle();
//
//        通过 getInstance() 方法进行实例化操作
        MonkeySingle monkeySingle = MonkeySingle.getInstance();
        monkeySingle.getShowMessage();
    }
}

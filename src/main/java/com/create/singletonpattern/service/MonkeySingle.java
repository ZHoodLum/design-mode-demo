package com.create.singletonpattern.service;
/**
 * @author：ZDY
 * @Date：Created in 2020/11/13
 * @Description:创建单例模式的对象 对象私有化
 */
public class MonkeySingle {
    /**
     * 创建 MonkeySingle 的一个对象
     */
    private static MonkeySingle monkeySingle = new MonkeySingle();

    /**
     * 让构造函数为 private，这样该类就不会被实例化
     */
    private MonkeySingle(){}

    /**
     * 获取唯一可用的对象 实例化对象
     * @return
     */
    public static MonkeySingle getInstance(){
        return monkeySingle;
    }

    /**
     * 私有类方法
     */
    public void getShowMessage(){
        System.out.println("猴子：Hi! 老头，Hello World!");
    }

}

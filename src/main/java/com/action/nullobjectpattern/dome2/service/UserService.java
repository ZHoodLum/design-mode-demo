package com.action.nullobjectpattern.dome2.service;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/1
 * @Description:
 */


public interface UserService {
    // 判断Book对象是否为空对象（Null Object）
    public boolean isNull();

    // 展示Book对象的信息内容。
    public void show();
}

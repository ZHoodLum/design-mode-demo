package com.action.nullobjectpattern.dome2.service.impl;

import com.action.nullobjectpattern.dome2.service.UserService;
/**
 * @author：ZDY
 * @Date：Created in 2020/12/1
 * @Description:
 */
public class NullUserServiceImpl implements UserService {

    /**
     * 判断是否为空
     * @return
     */
    @Override
    public boolean isNull() {
        return true;
    }

    /**
     * 展示信息 / 返回信息
     */
    @Override
    public void show() {
        System.out.println("Sorry，未找到符合您输入的ID的图书信息，请确认您输入的不是非法值。");
    }
}
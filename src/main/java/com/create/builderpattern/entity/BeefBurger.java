package com.create.builderpattern.entity;

import com.create.builderpattern.service.impl.HamBurgerServiceImpl;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/13
 * @Description:牛肉汉堡
 */


public class BeefBurger extends HamBurgerServiceImpl {

    @Override
    public String name() {
        return "叫我牛肉汉堡___ BeefBurger";
    }

    @Override
    public float price() {
        return 50.51f;
    }

}

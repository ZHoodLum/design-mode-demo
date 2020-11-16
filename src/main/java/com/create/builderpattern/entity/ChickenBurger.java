package com.create.builderpattern.entity;

import com.create.builderpattern.service.impl.HamBurgerServiceImpl;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/13
 * @Description:鸡肉汉堡
 */


public class ChickenBurger  extends HamBurgerServiceImpl {
    @Override
    public String name() {
        return "叫我鸡肉汉堡____ ChickenBurger";
    }

    @Override
    public float price() {
        return 100.11f;
    }
}

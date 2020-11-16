package com.create.builderpattern.entity;

import com.create.builderpattern.service.impl.ColdDrinkServiceImpl;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/13
 * @Description:牛奶饮品
 */


public class MilkDrink extends ColdDrinkServiceImpl {

    @Override
    public String name() {
        return "牛奶";
    }

    @Override
    public float price() {
        return 10.01f;
    }
}

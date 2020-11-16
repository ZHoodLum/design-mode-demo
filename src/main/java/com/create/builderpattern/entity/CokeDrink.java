package com.create.builderpattern.entity;

import com.create.builderpattern.service.impl.ColdDrinkServiceImpl;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/13
 * @Description:可乐饮品
 */


public class CokeDrink  extends ColdDrinkServiceImpl {

    @Override
    public String name() {
        return "可乐";
    }

    @Override
    public float price() {
        return 10.10f;
    }
}

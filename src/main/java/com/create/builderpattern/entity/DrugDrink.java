package com.create.builderpattern.entity;

import com.create.builderpattern.service.impl.ColdDrinkServiceImpl;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/13
 * @Description:
 */


public class DrugDrink  extends ColdDrinkServiceImpl {
    @Override
    public String name() {
        return "药";
    }

    @Override
    public float price() {
        return 0.00f;
    }

}

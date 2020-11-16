package com.create.builderpattern.service.impl;

import com.create.builderpattern.entity.BeefBurger;
import com.create.builderpattern.entity.ChickenBurger;
import com.create.builderpattern.entity.CokeDrink;
import com.create.builderpattern.entity.MilkDrink;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/13
 * @Description:点菜  点点点   你想吃什么
 */


public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new BeefBurger());
        meal.addItem(new CokeDrink());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new MilkDrink());
        return meal;
    }

}

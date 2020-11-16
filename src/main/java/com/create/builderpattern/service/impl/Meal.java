package com.create.builderpattern.service.impl;

import com.create.builderpattern.service.ItemsInformationService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/13
 * @Description:显示商品价格  名称等信息，语义可以理解为是一个菜单  主要计算点餐总价  点餐信息等等
 */

public class Meal {

    //菜单
    private List<ItemsInformationService> items = new ArrayList<ItemsInformationService>();

    //点餐时将商品加到菜单中  方便计算总价
    public void addItem(ItemsInformationService item){
        items.add(item);
    }

    //计算系统  计算菜单中的商品总价
    public float getCost(){
        float cost = 0.0f;
        for (ItemsInformationService item : items) {
            cost += item.price();
        }
        return cost;
    }

    //显示菜单中的菜品信息
    public void showItems(){
        for (ItemsInformationService item : items) {
            System.out.print("商品 : "+item.name());
            System.out.print(", 包装 : "+item.packing().pack());
            System.out.println(", 价格 : "+item.price());
        }
    }

}

package com.create.builderpattern.service.impl;

import com.create.builderpattern.service.ItemsInformationService;
import com.create.builderpattern.service.PackingService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/13
 * @Description:冷饮 商品的类别（可乐 汉堡 鸡腿等等）
 * 语义更趋向于对象 entity
 */

public abstract class ColdDrinkServiceImpl implements ItemsInformationService {

    @Override
    public abstract float price();

    @Override
    public PackingService packing() {
        return new PackingBottleServiceImpl();
    }
}

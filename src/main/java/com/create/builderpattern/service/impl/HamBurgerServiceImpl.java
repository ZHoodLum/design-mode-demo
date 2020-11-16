package com.create.builderpattern.service.impl;

import com.create.builderpattern.service.ItemsInformationService;
import com.create.builderpattern.service.PackingService;

import java.sql.Wrapper;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/13
 * @Description:汉堡 商品的类别（可乐 汉堡 鸡腿，薯条，鸡肉卷，红豆派等等。写饿了）
 * 语义更趋向于对象 entity
 */

public abstract class HamBurgerServiceImpl implements ItemsInformationService {

    @Override
    public abstract float price();

    @Override
    public PackingService packing() {
        return new PackingWrapperServiceImpl();
    }

}

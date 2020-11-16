package com.create.builderpattern.service;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/13
 * @Description:商品信息接口
 */

public interface ItemsInformationService {
    /**
     * 名称
     * @return 商品名称
     */
    public String name();

    /**
     * 价格
     * @return 商品价格
     */
    public float price();

    /**
     * 商品使用的包装
     * @return 包装类型
     */
    public PackingService packing();
}

package com.create.builderpattern.service.impl;

import com.create.builderpattern.service.PackingService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/13
 * @Description:纸盒包装盒 商品的包装盒
 * 语义更趋向于对象 entity
 */

public class PackingWrapperServiceImpl implements PackingService {

    @Override
    public String pack() {
        return "Wrapper";
    }

}

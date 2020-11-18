package com.structure.bridgepattern.service.impl;

import com.structure.bridgepattern.service.DrawAPIService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/16
 * @Description:
 */


public class GreenDrawServiceImpl implements DrawAPIService {

    @Override
    public void drawRadius(String radius, int x, int y) {
        System.out.println();
        System.out.println("他的颜色是：DrawAPIServiceImpl,王者");
        System.out.println(radius + "______" + x + "______" + y);
        System.out.println("画一个绿色的龙和lv绿绿绿绿彩虹!");
    }
}

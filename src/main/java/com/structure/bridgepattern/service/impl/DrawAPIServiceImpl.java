package com.structure.bridgepattern.service.impl;

import com.structure.bridgepattern.service.DrawAPIService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/16
 * @Description:
 */


public class DrawAPIServiceImpl implements DrawAPIService {

    @Override
    public void drawRadius(String radius, int x, int y) {
        System.out.println();
        System.out.println("他的颜色是：DrawAPIServiceImpl,青铜");
        System.out.println(radius + "______" + x + "______" + y);
        System.out.println("来！左手跟我画一条龙，右手在画一道彩虹！！");
    }
}

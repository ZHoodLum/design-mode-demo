package com.structure.bridgepattern.service.impl;

import com.structure.bridgepattern.service.DrawAPIService;

import javax.xml.crypto.Data;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/16
 * @Description:
 */


public class RedDrawServiceImpl implements DrawAPIService {

    @Override
    public void drawRadius(String radius, int x, int y) {
        System.out.println();
        System.out.println("他的颜色是：RedDrawServiceImpl,王者");
        System.out.println(radius + "______" + x + "______" + y);
        System.out.println("来！左手跟我画一条龙，右手在画一道彩虹！！");
    }
}

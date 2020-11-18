package com.structure.bridgepattern.bridge;

import com.structure.bridgepattern.service.DrawAPIService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/16
 * @Description:
 */


public abstract class Shape {
    protected DrawAPIService drawAPI;

    protected Shape(DrawAPIService drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();

}

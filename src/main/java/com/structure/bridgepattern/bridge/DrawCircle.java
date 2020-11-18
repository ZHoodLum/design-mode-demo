package com.structure.bridgepattern.bridge;

import com.structure.bridgepattern.service.DrawAPIService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/16
 * @Description:
 */


public class DrawCircle extends Shape {
    private int x, y;
    private String radius;

    public DrawCircle(String radius, int x, int y, DrawAPIService drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    @Override
    public void draw() {
        drawAPI.drawRadius(radius,x,y);
    }
}

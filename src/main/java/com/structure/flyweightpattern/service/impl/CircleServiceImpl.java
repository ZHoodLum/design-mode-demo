package com.structure.flyweightpattern.service.impl;

import com.structure.flyweightpattern.service.ShapeService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/24
 * @Description:
 */


public class CircleServiceImpl implements ShapeService {

    private String color;
    private int x;
    private int y;
    private int radius;

    public CircleServiceImpl(String color){

        this.color = color;
    }

    public void setX(int x) {

        this.x = x;
    }

    public void setY(int y) {

        this.y = y;
    }

    public void setRadius(int radius) {

        this.radius = radius;
    }

    @Override
    public void drawShape() {
        System.out.println("Circle: Draw() [Color : " + color
                +", x : " + x +", y :" + y +", radius :" + radius);
    }
}

package com.structure.flyweightpattern.controller;

import com.structure.flyweightpattern.factory.ShapeFactory;
import com.structure.flyweightpattern.service.impl.CircleServiceImpl;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/24
 * @Description:
 */


public class FlyweightPatternController {
    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; ++i) {

            CircleServiceImpl circle = (CircleServiceImpl) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.drawShape();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }


}


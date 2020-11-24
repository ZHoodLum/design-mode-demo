package com.structure.decoratorpattern.controller;

import com.structure.decoratorpattern.service.ShapeService;
import com.structure.decoratorpattern.service.impl.CircleServiceImpl;
import com.structure.decoratorpattern.service.impl.RectangleServiceImpl;
import com.structure.decoratorpattern.service.impl.RedShapeDecoratorServiceImpl;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/24
 * @Description:
 */


public class DecoratorPatternController {
    public static void main(String[] args) {

        ShapeService circle = new CircleServiceImpl();

        ShapeService redCircle = new RedShapeDecoratorServiceImpl(new CircleServiceImpl());

        ShapeService redRectangle = new RedShapeDecoratorServiceImpl(new RectangleServiceImpl());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }

}

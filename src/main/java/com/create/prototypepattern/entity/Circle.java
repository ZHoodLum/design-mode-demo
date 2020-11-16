package com.create.prototypepattern.entity;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/13
 * @Description:
 */

public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

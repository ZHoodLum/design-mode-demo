package com.create.prototypepattern.entity;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/13
 * @Description:
 */


public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

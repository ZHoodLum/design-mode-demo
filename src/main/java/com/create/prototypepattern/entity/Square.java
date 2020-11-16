package com.create.prototypepattern.entity;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/13
 * @Description:
 */

public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
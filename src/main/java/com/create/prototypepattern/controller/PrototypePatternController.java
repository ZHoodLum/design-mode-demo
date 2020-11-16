package com.create.prototypepattern.controller;

import com.create.prototypepattern.Cache.ShapeCache;
import com.create.prototypepattern.entity.Shape;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/13
 * @Description:
 */


public class PrototypePatternController {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}

package com.structure.decoratorpattern.service.impl;

import com.structure.decoratorpattern.service.ShapeService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/24
 * @Description:
 */


public class RedShapeDecoratorServiceImpl extends ShapeDecoratorServiceImpl {

    public RedShapeDecoratorServiceImpl(ShapeService decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(ShapeService decoratedShape){
        System.out.println("Border Color: Red");
    }
}
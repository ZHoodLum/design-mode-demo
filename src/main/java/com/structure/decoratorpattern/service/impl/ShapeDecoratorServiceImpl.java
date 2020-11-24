package com.structure.decoratorpattern.service.impl;

import com.structure.decoratorpattern.service.ShapeService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/24
 * @Description:
 */


public class ShapeDecoratorServiceImpl implements ShapeService {
    protected ShapeService decoratedShape;

    public ShapeDecoratorServiceImpl(ShapeService decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(){
        decoratedShape.draw();
    }}

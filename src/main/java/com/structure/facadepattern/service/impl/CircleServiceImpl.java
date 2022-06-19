package com.structure.facadepattern.service.impl;

import com.structure.decoratorpattern.service.ShapeService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/24
 * @Description:
 */


public class CircleServiceImpl implements ShapeService {

    @Override
    public void draw() {
        System.out.println("CircleServiceImpl::draw()");
    }}
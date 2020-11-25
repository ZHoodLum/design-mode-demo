package com.structure.facadepattern.controller;

import com.structure.facadepattern.service.impl.ShapeMaker;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/24
 * @Description:
 */


public class FacadePatternController {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }

}

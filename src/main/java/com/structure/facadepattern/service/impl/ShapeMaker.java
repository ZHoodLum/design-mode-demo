package com.structure.facadepattern.service.impl;

import com.create.prototypepattern.entity.Square;
import com.structure.decoratorpattern.service.ShapeService;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/24
 * @Description:
 */


public class ShapeMaker {
    private ShapeService circle;
    private ShapeService rectangle;
    private ShapeService square;

    public ShapeMaker() {
        circle = new CircleServiceImpl();
        rectangle = new RectangleServiceImpl();
        square = new SquareServiceImpl();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}

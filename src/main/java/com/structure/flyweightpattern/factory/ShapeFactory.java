package com.structure.flyweightpattern.factory;

import com.structure.flyweightpattern.service.ShapeService;
import com.structure.flyweightpattern.service.impl.CircleServiceImpl;

import java.util.HashMap;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/24
 * @Description:
 */


public class ShapeFactory {
    private static final HashMap<String, ShapeService> circleMap = new HashMap();

    public static ShapeService getCircle(String color) {
        CircleServiceImpl circle = (CircleServiceImpl)circleMap.get(color);

        if(circle == null) {
            circle = new CircleServiceImpl(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}

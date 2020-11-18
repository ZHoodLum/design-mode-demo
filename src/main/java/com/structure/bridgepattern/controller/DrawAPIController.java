package com.structure.bridgepattern.controller;

import com.structure.bridgepattern.bridge.DrawCircle;
import com.structure.bridgepattern.bridge.Shape;
import com.structure.bridgepattern.service.DrawAPIService;
import com.structure.bridgepattern.service.impl.DrawAPIServiceImpl;
import com.structure.bridgepattern.service.impl.GreenDrawServiceImpl;
import com.structure.bridgepattern.service.impl.RedDrawServiceImpl;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/16
 * @Description:
 */


public class DrawAPIController {
    public static void main(String[] args) {
        //青铜画画
        DrawAPIService drawAPIService = new DrawAPIServiceImpl();
        drawAPIService.drawRadius("white", 1, 1);

        //王者画画
        Shape redCircle = new DrawCircle("red",100, 10, new RedDrawServiceImpl());
        Shape greenCircle = new DrawCircle("green",100, 10, new GreenDrawServiceImpl());

        redCircle.draw();
        greenCircle.draw();

    }

}

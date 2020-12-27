package com.springmvc.frontcontrollerpattern.controller;

import com.springmvc.frontcontrollerpattern.contro.FrontController;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/13
 * @Description:
 */


public class FrontControllerPatternController {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}

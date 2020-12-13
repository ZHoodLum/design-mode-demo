package com.action.mediatorpattern.controller;

import com.action.mediatorpattern.entity.Users;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/26
 * @Description:
 */


public class MediatorPatternController {
    public static void main(String[] args) {
        Users robert = new Users("Robert");
        Users john = new Users("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}

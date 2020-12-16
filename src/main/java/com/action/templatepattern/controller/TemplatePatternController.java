package com.action.templatepattern.controller;

import com.action.templatepattern.service.Game;
import com.action.templatepattern.service.impl.Cricket;
import com.action.templatepattern.service.impl.Football;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/11
 * @Description:
 */


public class TemplatePatternController {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}

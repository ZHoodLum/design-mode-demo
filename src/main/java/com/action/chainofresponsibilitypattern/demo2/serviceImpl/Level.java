package com.action.chainofresponsibilitypattern.demo2.serviceImpl;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/25
 * @Description:
 */


public class Level {
    private int level = 0;
    public Level(int level){
        this.level = level;
    };

    public boolean above(Level level){
        if(this.level >= level.level){
            return true;
        }
        return false;
    }
}

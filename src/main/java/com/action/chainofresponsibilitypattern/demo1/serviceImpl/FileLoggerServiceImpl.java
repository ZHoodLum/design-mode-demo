package com.action.chainofresponsibilitypattern.demo1.serviceImpl;

import com.action.chainofresponsibilitypattern.demo1.utils.AbstractLoggerUtils;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/25
 * @Description:
 */


public class FileLoggerServiceImpl extends AbstractLoggerUtils {

    public FileLoggerServiceImpl(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
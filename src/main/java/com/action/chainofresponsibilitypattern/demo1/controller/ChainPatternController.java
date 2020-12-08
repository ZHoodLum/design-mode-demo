package com.action.chainofresponsibilitypattern.demo1.controller;

import com.action.chainofresponsibilitypattern.demo1.serviceImpl.ConsoleLoggerServiceImpl;
import com.action.chainofresponsibilitypattern.demo1.serviceImpl.ErrorLoggerServiceImpl;
import com.action.chainofresponsibilitypattern.demo1.serviceImpl.FileLoggerServiceImpl;
import com.action.chainofresponsibilitypattern.demo1.utils.AbstractLoggerUtils;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/25
 * @Description:
 */


public class ChainPatternController {
    private static AbstractLoggerUtils getChainOfLoggers(){

        AbstractLoggerUtils errorLogger = new ErrorLoggerServiceImpl(AbstractLoggerUtils.ERROR);
        AbstractLoggerUtils fileLogger = new FileLoggerServiceImpl(AbstractLoggerUtils.DEBUG);
        AbstractLoggerUtils consoleLogger = new ConsoleLoggerServiceImpl(AbstractLoggerUtils.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLoggerUtils loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLoggerUtils.INFO, "This is an information111.");

        loggerChain.logMessage(AbstractLoggerUtils.DEBUG, "This is an debug level information222.");

        loggerChain.logMessage(AbstractLoggerUtils.ERROR, "This is an error information333.");
    }
}

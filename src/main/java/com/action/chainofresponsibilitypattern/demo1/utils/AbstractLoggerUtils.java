package com.action.chainofresponsibilitypattern.demo1.utils;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/25
 * @Description:
 */


public abstract class AbstractLoggerUtils {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    //责任链中的下一个元素
    protected AbstractLoggerUtils nextLogger;

    public void setNextLogger(AbstractLoggerUtils nextLogger) {
        //将当前得实现类进行赋值    比如第一次是A，第二次进来B就是A得儿子   第三次进来得C就是B得儿子   以此类推 类似于树形结构
//        第一次
//        loggerChain = {ErrorLoggerServiceImpl@542}
//        level = 3

//        第二次
//        nextLogger = {FileLoggerServiceImpl@544}
//        level = 2

//        第三次
//        nextLogger = {ConsoleLoggerServiceImpl@546}
//        level = 1
//        nextLogger = null
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            //递归调用
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);
}
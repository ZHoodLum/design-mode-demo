package com.create.singletonpattern.singLetonmode;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/13
 * @Description:双检锁/双重校验锁（DCL，即 double-checked locking）
 * <p>
 * JDK 版本：JDK1.5 起
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：较复杂
 *
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 *
 * volatile关键字 ：
 *      1、可见性：被volatile所修饰的变量对所有线程总数可见，比如说一个线程修改了该变量信息，其他线程立即得知、
 *      2、禁止指令重排优化，从而避免多线程环境下程序出现乱序执行的现象
 */


public class DoubleCheckedLockingSingLeton {
    /**
     * 保证使用时才实例化
     */
    private volatile static DoubleCheckedLockingSingLeton instance;

    private DoubleCheckedLockingSingLeton() {
    }

    /**
     * 通过 getSingleton() 方法实例化对象
     * 对类进行锁 并实例化对象
     * @return
     */
    public static DoubleCheckedLockingSingLeton getSingleton() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingLeton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingLeton();
                }
            }
        }
        return instance;
    }
}

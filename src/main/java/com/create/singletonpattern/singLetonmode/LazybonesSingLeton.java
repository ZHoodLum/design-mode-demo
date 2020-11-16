package com.create.singletonpattern.singLetonmode;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/13
 * @Description:懒汉式实例化对象，只有用到的时候才会实例化对象
 *
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是(使用锁的时候)，则为否
 * 实现难度：易
 * 描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 * 优点：第一次调用才初始化，避免内存浪费。
 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 * getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。
 */


public class LazybonesSingLeton {

    //私有话静态变量
    private static LazybonesSingLeton lazybonesSingLeton;

    /**
     * 防止直接实例化对象
     */
    private LazybonesSingLeton() {
    }

    /**
     * 使用 getInstance() 方法进行实例化操作
     * @return
     */
    public static LazybonesSingLeton getInstance() {
        if (lazybonesSingLeton == null) {
            lazybonesSingLeton = new LazybonesSingLeton();
        }
        return lazybonesSingLeton;
    }

    /**
     * 上面 getInstance() 方法实例化对象，会出现线程不安全的问题，可以通过 synchronized 锁，对方法加锁
     * @return
     */
    public static synchronized LazybonesSingLeton getInstance1() {
        if (lazybonesSingLeton == null) {
            lazybonesSingLeton = new LazybonesSingLeton();
        }
        return lazybonesSingLeton;
    }
}

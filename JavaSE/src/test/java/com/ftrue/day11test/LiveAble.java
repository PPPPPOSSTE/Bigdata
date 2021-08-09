package com.ftrue.day11test;

/**
 * @ClassName: LiveAble
 * @Description:
 * @Author: zhangzhiqi on 2021/7/5 19:51
 * @Version: 1.0
 */
public interface LiveAble {
    // 定义抽象方法
    //抽象方法在子类（非抽象类）中必须实现
    public abstract void eat();
    public abstract void sleep();

    //默认方法
    //可以继承，可以重写，二选一，但是只能通过实现类的对象来调用
    public default void fly() {
        System.out.println("天上飞");
    }

    //静态方法
    //静态与.class文件相关，只能使用接口名调用，不可以通过实现类的类名或者实现类的对象调用
    public static void run() {
        System.out.println("跑起来~~~");
    }

}

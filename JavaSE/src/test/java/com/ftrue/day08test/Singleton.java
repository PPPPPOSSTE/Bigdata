package com.ftrue.day08test;

/**
 * @ClassName: SingletonIntime
 * @Description:
 * @Author: zhangzhiqi on 2021/7/3 22:22
 * @Version: 1.0
 */
public class Singleton {
    //饿汉模式
    /*private static final Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getSingleton() {
        return singleton;
    }*/

    //===============================

    //懒汉模式
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}

package com.ftrue.day11test.fin.demo05;

/**
 * @ClassName: SubClass
 * @Description:
 * @Author: zhiqi zhang on 2021/7/10 8:43
 * @Version: 1.0
 */
public class SubClass {
    //直接声明初始化
    public static final int NUM = 10;
    //先声明后初始化
    public static final int NUM2;

    static {
        NUM2 = 20;
    }

    //错误的写法
    /*public SubClass() {
        NUM2 = 20;
    }*/
}

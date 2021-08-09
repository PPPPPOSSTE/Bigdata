package com.ftrue.day11test.fin.demo04;

/**
 * @ClassName: SubClass
 * @Description:
 * @Author: zhiqi zhang on 2021/7/10 8:43
 * @Version: 1.0
 */
public class SubClass {
    //直接声明和初始化
    public final int NUM = 10;


    //===================================


    //先声明后初始化
    public final int NUM2;

    //当所有构造器对常量的赋值是一样的，则可以通过构造代码块统一赋值，简化代码的书写
    {
        NUM2 = 30;
    }

    //当不同的构造器赋给常量的值不一样，则可以在每个构造器单独赋值
    /*public SubClass() {
        NUM2 = 10;
    }

    public SubClass(int a) {
        NUM2 = a;
    }*/
}

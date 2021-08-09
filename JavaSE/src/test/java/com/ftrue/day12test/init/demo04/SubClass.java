package com.ftrue.day12test.init.demo04;

/**
 * @ClassName: SubClass
 * @Description:
 * @Author: zhiqi zhang on 2021/7/12 15:25
 * @Version: 1.0
 */
public class SubClass {

    static int a = method();

    int b = show();

    private int show() {
        System.out.println("子类的实例变量显示初始化");
        return 10;
    }

    private static int method() {
        System.out.println("子类的静态变量显示初始化");
        return 10;
    }

    static {
        System.out.println("静态代码块");
    }

    public SubClass() {
        System.out.println("子类的无参构造器中显示代码");
    }

    {
        System.out.println("子类的构造器代码块");
    }
}

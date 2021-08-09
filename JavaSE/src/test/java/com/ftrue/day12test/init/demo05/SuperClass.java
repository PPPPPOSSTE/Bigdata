package com.ftrue.day12test.init.demo05;

/**
 * @ClassName: SuperClass
 * @Description:
 * @Author: zhiqi zhang on 2021/7/12 15:34
 * @Version: 1.0
 */
public class SuperClass {
    static int a = method();

    int b = show();

    private int show() {
        System.out.println("父类的实例变量显示初始化");
        return 10;
    }

    private static int method() {
        System.out.println("父类的静态变量显示初始化");
        return 10;
    }

    public SuperClass() {
        System.out.println("父类的无参构造器中显示代码");
    }

    {
        System.out.println("父类的构造器代码块");
    }

    static {
        System.out.println("父类静态代码块");
    }
}

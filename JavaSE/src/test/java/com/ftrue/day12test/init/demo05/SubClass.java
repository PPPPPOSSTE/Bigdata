package com.ftrue.day12test.init.demo05;

/**
 * @ClassName: SuperClass
 * @Description:
 * @Author: zhiqi zhang on 2021/7/12 15:34
 * @Version: 1.0
 */
public class SubClass extends SuperClass {
    static int a = method();

    int b = show();

    //此时不会重头进行静态初始化；而是只执行实例初始化；然后接着顺序执行静态初始化；
    static SubClass sc = new SubClass();

    private int show() {
        System.out.println("子类的实例变量显示初始化");
        return 10;
    }

    private static int method() {
        System.out.println("子类的静态变量显示初始化");
        return 10;
    }

    public SubClass() {
        System.out.println("子类的无参构造器中显示代码");
    }

    {
        System.out.println("子类的构造器代码块");
    }

    static {
        System.out.println("子类静态代码块");
    }
}

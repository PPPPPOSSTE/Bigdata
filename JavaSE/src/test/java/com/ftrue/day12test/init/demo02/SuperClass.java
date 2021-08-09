package com.ftrue.day12test.init.demo02;

/**
 * @ClassName: SuperClass
 * @Description:
 * @Author: zhiqi zhang on 2021/7/12 14:15
 * @Version: 1.0
 */
public class SuperClass {
    int superVar = method();

    private int method() {
        System.out.println("父类的实例变量的显示初始化");
        return 10;
    }

    public SuperClass() {
        System.out.println("父类的无参构造器中的显示代码");
    }

    {
        System.out.println("父类的构造代码块");
    }
}

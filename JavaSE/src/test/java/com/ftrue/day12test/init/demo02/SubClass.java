package com.ftrue.day12test.init.demo02;

/**
 * @ClassName: SubClass
 * @Description:
 * @Author: zhiqi zhang on 2021/7/12 14:18
 * @Version: 1.0
 */
public class SubClass extends SuperClass {
    int subVar = show();

    //递归循环创建SubClass 最终导致内存溢出  报错
    //SubClass sc = new SubClass();

    private int show() {
        System.out.println("子类的实例变量的显示初始化");
        return 10;
    }

    public SubClass() {
        //
        //super();
        System.out.println("子类的无参构造器中的显示代码");
    }

    {
        System.out.println("子类的构造代码块");
    }
}

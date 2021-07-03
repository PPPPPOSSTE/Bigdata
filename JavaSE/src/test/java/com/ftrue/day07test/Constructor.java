package com.ftrue.day07test;

/**
 * @ClassName: Constructor
 * @Description:
 * @Author: zhangzhiqi on 2021/7/3 20:42
 * @Version: 1.0
 */
public class Constructor {
    {
        System.out.println("构造器代码块");
    }

    /*public Constructor() {
        System.out.println("子类的无参构造器");
    }*/

    public Constructor() {
        this(1);
        System.out.println("子类的无参构造器");
    }
    public Constructor(int a) {
        this(1,2);
        System.out.println("子类的一个参构造器");
    }
    public Constructor(int a,int b) {
        System.out.println("子类的两个参构造器");
    }
}

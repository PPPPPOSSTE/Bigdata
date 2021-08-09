package com.ftrue.day10test.demo09;

/**
 * @ClassName: SubClass
 * @Description:
 * @Author: zhiqi zhang on 2021/7/9 11:37
 * @Version: 1.0
 */
public class SubClass extends SuperClass {
    public SubClass() {
        System.out.println("子类的无参构造器");
    }

    public SubClass(int num) {
        super(num);
        System.out.println("子类的有参构造器");
    }
}

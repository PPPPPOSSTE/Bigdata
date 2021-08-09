package com.ftrue.day10test.demo08;

/**
 * @ClassName: SubClass
 * @Description:
 * @Author: zhiqi zhang on 2021/7/9 11:25
 * @Version: 1.0
 */
public class SubClass extends SuperClass {
    public SubClass() {
        //隐式代码：实例的初始化过程
        //super();

        //显示代码:针对成员的赋值
        System.out.println("子类的无参构造器");
    }
}

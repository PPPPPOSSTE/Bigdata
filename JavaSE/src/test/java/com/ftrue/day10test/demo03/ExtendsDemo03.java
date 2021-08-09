package com.ftrue.day10test.demo03;

/**
 * @ClassName: ExtendsDemo03
 * @Description:
 * @Author: zhiqi zhang on 2021/7/9 9:48
 * @Version: 1.0
 */
/*
* 继承的特点2：静态成员
*   子类可以继承父类的静态成员
* */
public class ExtendsDemo03 {
    public static void main(String[] args) {
        //静态成员属于父类
        System.out.println(SuperClass.num);
        SuperClass.method();

        System.out.println("===================");

        System.out.println(SubClass.num);
        SubClass.method();

        System.out.println("===================");
        SubClass subClass = new SubClass();
        System.out.println(subClass.num);  //不被推荐使用
        subClass.method();  //不被推荐使用
    }
}

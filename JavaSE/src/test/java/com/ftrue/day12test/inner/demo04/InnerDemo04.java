package com.ftrue.day12test.inner.demo04;

/**
 * @ClassName: InnerDemo04
 * @Description:
 * @Author: zhiqi zhang on 2021/7/12 10:19
 * @Version: 1.0
 */
/*
*
* 匿名内部类：
*
* 学习目的：
*   1.
*   2.
*
*
*
* */
public class InnerDemo04 {
    public static void main(String[] args) {
        //创建实现类对象
        SubClass sc = new SubClass();
        SuperInterface sc2 = new SubClass();
        sc.print("hello world");
        sc2.print("hello world");

        System.out.println("==============================");

        //si就是通过匿名内部类的方法创建接口实现类对象
        SuperInterface si = new SuperInterface() {
            @Override
            public void print(String str) {
                System.out.println(str);
            }
        };
        si.print("hello world");

    }
}

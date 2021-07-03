package com.ftrue.day07test;

/**
 * @ClassName: ClassDemo
 * @Description:
 * @Author: zhangzhiqi on 2021/7/3 19:40
 * @Version: 1.0
 */
public class ClassDemo {
    int num = 10;

    public void method() {
        int num = 20;
        System.out.println("num = " + num);  //就近原则 20
        //需求:在打印20的同时,打印10
        System.out.println("num = " + this.num);
    }

    public void show() {
        System.out.println("this = " + this);
    }
}

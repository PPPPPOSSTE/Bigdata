package com.ftrue.day22exam.exercise01;

/**
 * @ClassName: Exercise0125
 * @Description:
 * @Author: zhiqi zhang on 2021/7/22 23:56
 * @Version: 1.0
 */
//25.	以下程序的运行结果是：
//B
//A
//AB
public class Exercise0125 {
    public static void main(String[] args) {
        new A(new B());
    }
}

class A {
    public A() {
        System.out.println("A");
    }

    public A(B b) {
        this();
        System.out.println("AB");
    }
}

class B {
    public B() {
        System.out.println("B");
    }
}

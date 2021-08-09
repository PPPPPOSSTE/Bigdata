package com.ftrue.day11test;

/**
 * @ClassName: Test02
 * @Description:
 * @Author: zhangzhiqi on 2021/7/5 21:23
 * @Version: 1.0
 */
abstract class Animal11 {
    abstract void eat();
}

class Cat11 extends Animal11 {
    public void eat() {
        System.out.println("吃鱼");
    }

    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}

class Dog11 extends Animal11 {
    public void eat() {
        System.out.println("吃骨头");
    }

    public void watchHouse() {
        System.out.println("看家");
    }
}

public class Test02 {
    public static void main(String[] args) {
        // 向上转型
        Animal11 a = new Cat11();
        a.eat(); // 调用的是 Cat 的 eat
        // 向下转型
        Cat11 c = (Cat11) a;
        c.catchMouse(); // 调用的是 Cat 的 catchMouse
    }
}

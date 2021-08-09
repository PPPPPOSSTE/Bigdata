package com.ftrue.day10test;

/**
 * @ClassName: ExtendDermo01
 * @Description:
 * @Author: zhangzhiqi on 2021/7/4 14:47
 * @Version: 1.0
 */
class Animal {
    //public String name;
    private String name;
    public int age;

    public void eat() {
        System.out.println(age + "岁的" + name + "在吃东西");
    }
}


class Cat extends Animal {
    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}

public class ExtendDemo01 {
    public static void main(String[] args) {
        Cat cat = new Cat();

        //cat.name = "Tom";

        cat.age = 2;

        cat.catchMouse();

        cat.eat();
    }
}

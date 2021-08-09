package com.ftrue.day10test.demo01;

/**
 * @ClassName: Dog
 * @Description:
 * @Author: zhiqi zhang on 2021/7/9 18:32
 * @Version: 1.0
 */
public class Dog extends Animal {
    public String name;
    public int age;

    public void eat() {
        System.out.println("干饭饭");
    }

    public void lookHome() {
        System.out.println("看家");
    }
}

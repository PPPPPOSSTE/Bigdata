package com.ftrue.day10test.demo10;

/**
 * @ClassName: Animal
 * @Description:
 * @Author: zhiqi zhang on 2021/7/9 11:47
 * @Version: 1.0
 */
public class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //含有多个子类的共性方法，但该方法需要重写
    public void eat() {
        System.out.println("干饭饭");
    }

    //含有多个子类的共性方法，但该方法不需要重写
    public void sleep() {
        System.out.println("睡觉觉");
    }
}














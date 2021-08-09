package com.ftrue.day11test.poly.demo04;

/**
 * @ClassName: Animal
 * @Description:
 * @Author: zhiqi zhang on 2021/7/10 15:38
 * @Version: 1.0
 */
public abstract class Animal {
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
}

package com.ftrue.day11test.inter.demo04;

/**
 * @ClassName: Animal
 * @Description:
 * @Author: zhiqi zhang on 2021/7/10 11:12
 * @Version: 1.0
 */
public abstract class Animal implements AnimalInterface {
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

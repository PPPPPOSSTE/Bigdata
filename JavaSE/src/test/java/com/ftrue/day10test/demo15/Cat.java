package com.ftrue.day10test.demo15;

/**
 * @ClassName: Cat
 * @Description:
 * @Author: zhiqi zhang on 2021/7/9 23:32
 * @Version: 1.0
 */
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println(getAge() + "岁的" + getName() + "正在吃鱼");
    }

    //猫拥有自己特有的方法:抓老鼠
    public void catchMouse() {
        System.out.println(getAge() + "岁的" + getName() + "正在抓老鼠");
    }

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }
}

package com.ftrue.day11test.inter.demo04;

/**
 * @ClassName: Cat
 * @Description:
 * @Author: zhiqi zhang on 2021/7/10 11:14
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

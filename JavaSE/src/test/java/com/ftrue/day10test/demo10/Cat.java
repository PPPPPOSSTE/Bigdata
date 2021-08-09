package com.ftrue.day10test.demo10;

/**
 * @ClassName: Cat
 * @Description:
 * @Author: zhiqi zhang on 2021/7/9 11:50
 * @Version: 1.0
 */
public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    //重写父类中的eat()
    @Override
    public void eat() {
        System.out.println(getAge() + "岁的" + getName() + "正在吃鱼");
    }

    //猫还存在自己的特有方法
    public void catchMouse() {
        System.out.println(getAge() + "岁的" + getName() + "正在抓老鼠");
    }
}

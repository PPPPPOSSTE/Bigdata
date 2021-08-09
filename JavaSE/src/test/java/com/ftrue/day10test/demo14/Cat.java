package com.ftrue.day10test.demo14;

/**
 * @ClassName: Cat
 * @Description:
 * @Author: zhiqi zhang on 2021/7/9 23:32
 * @Version: 1.0
 */
public class Cat extends Animal {
    public Cat() {
        super();
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    //重写父类的中的eat()
    @Override
    public void eat() {
        System.out.println(getAge() + "岁的" + getName() + "正在吃鱼");
    }

    @Override
    public void play() {

    }

    //猫还存在自己的特有方法
    public void catchMouse() {
        System.out.println(getAge() + "岁的" + getName() + "正在抓老鼠");
    }
}

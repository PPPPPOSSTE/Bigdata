package com.ftrue.day11test.inter.demo04;

/**
 * @ClassName: Dog
 * @Description:
 * @Author: zhiqi zhang on 2021/7/10 11:15
 * @Version: 1.0
 */
public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println(getAge() + "岁的" + getName() + "正在吃shit");
    }

    //狗拥有自己特有的方法:看家
    public void lookHome() {
        System.out.println(getAge() + "岁的" + getName() + "正在看家");
    }

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}

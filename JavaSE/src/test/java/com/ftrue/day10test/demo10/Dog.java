package com.ftrue.day10test.demo10;

/**
 * @ClassName: Dog
 * @Description:
 * @Author: zhiqi zhang on 2021/7/9 11:54
 * @Version: 1.0
 */
public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    //重写父类的中的eat()
    @Override
    public void eat() {
        System.out.println(getAge() + "岁的" + getName() + "正在吃骨头");
    }

    //狗还存在自己的特有方法
    public void lookHome() {
        System.out.println(getAge() + "岁的" + getName() + "正在看家");
    }
}

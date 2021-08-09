package com.ftrue.day10test.demo15;

/**
 * @ClassName: ExtendsDemo14
 * @Description:
 * @Author: zhiqi zhang on 2021/7/9 23:35
 * @Version: 1.0
 */
public class ExtendsDemo15 {
    public static void main(String[] args) {
        //创建猫对象
        Cat cat = new Cat("Tom", 2);
        cat.catchMouse();
        cat.eat();
        cat.sleep();

        System.out.println("===================================");

        //创建狗对象
        Dog dog = new Dog("TwoHa", 3);
        dog.lookHome();
        dog.eat();
        dog.sleep();
    }
}

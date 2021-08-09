package com.ftrue.day11test;

/**
 * @ClassName: InterfaceDemo
 * @Description:
 * @Author: zhangzhiqi on 2021/7/5 19:58
 * @Version: 1.0
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Animal a = new Animal();

        //接口的抽象方法
        a.eat();
        a.sleep();

        //接口的默认方法
        a.fly();

        //实现类无法继承接口的静态方法，所以无法通过实现类的类名或实现类的对象名调用接口的静态方法。
        //这和子类继承
        //Animal.run();  //编译报错
        //a.run();  //编译报错
        LiveAble.run();

    }
}

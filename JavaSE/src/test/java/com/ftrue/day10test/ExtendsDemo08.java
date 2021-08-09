package com.ftrue.day10test;

/**
 * @ClassName: ExtendsDemo08
 * @Description:
 * @Author: zhangzhiqi on 2021/7/5 8:51
 * @Version: 1.0
 */

class Animal8 {
    public void eat() {
        System.out.println("animal : eat");
    }

    public static void test1() {
        System.out.println("Animal8------test1~~~");
    }
}
class Cat8 extends Animal8 {
    public void eat() {
        System.out.println("cat : eat");
    }
    public void eatTest() {
        this.eat(); // this 调用本类的方法
        super.eat(); // super 调用父类的方法
    }

    public static void test1() {
        System.out.println("Cat8-------test1~~~");
    }

    public static void test2() {
        System.out.println("test2~~~");
    }
}
public class ExtendsDemo08 {
    public static void main(String[] args) {
        Animal8 a = new Animal8();
        a.eat();

        Cat8 c = new Cat8();
        Animal8 a2 = new Cat8();
        c.eatTest();
        //当父类和子类中有同名且参数相同的静态方法时，父类引用子类时，父类会调用父类的静态方法，而不是子类的方法。
        a2.test1();
        System.out.println("==============");

        //静态方法的相关测试
        //子类继承父类时，子类会继承父类的静态方法。
        //但是子类实现接口时，子类不会继承接口的静态方法。
        Cat8.test1();  //可以执行，但不推荐；推荐：Animal8.test1();
        c.test1();  //可以执行，但不推荐；推荐：Animal8.test1();
        c.test2();
    }
}
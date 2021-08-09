package com.ftrue.day10test.demo01;

/**
 * @ClassName: ExtendsDemo01
 * @Description:
 * @Author: zhiqi zhang on 2021/7/9 18:34
 * @Version: 1.0
 */
/*
 * 继承的好处:
 *      1.提高代码的复用性,从而提高开发效率
 *      2.提高代码的扩展性
 *      3.继承关系是学习多态思想的前提条件之一
 *
 * 继承的特点:
 *      子类继承父类的属性和行为,从子类拥有和父类相同的属性和相同的行为
 *
 * 继承的格式:
 *      public class 父类类名 {}
 *
 *      public class 子类类名 extends 父类类名{}
 * */
public class ExtendsDemo01 {
    public static void main(String[] args) {
        //创建猫对象
        Cat cat = new Cat();
        cat.catchMouse();
        cat.eat();
        System.out.println("==========================");
        //创建狗对象
        Dog dog = new Dog();
        dog.lookHome();
        dog.eat();
    }
}

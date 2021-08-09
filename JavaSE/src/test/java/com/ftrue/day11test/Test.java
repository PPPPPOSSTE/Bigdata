package com.ftrue.day11test;

/**
 * @ClassName: Test
 * @Description:
 * @Author: zhangzhiqi on 2021/7/5 21:07
 * @Version: 1.0
 */
class Cat extends Animal2 {
    public void eat() {
        System.out.println("吃鱼");
    }

    public void cattest() {
        System.out.println("cat");
    }
}

class Dog extends Animal2 {
    public void eat() {
        System.out.println("吃骨头");
    }

    public void dogtest() {
        System.out.println("dog");
    }
}


public class Test {
    public static void main(String[] args) {
        // 多态形式，创建对象
        Animal2 a1 = new Cat();
        // 调用的是 Cat 的 eat
        a1.eat();
        a1.testAnimal2();
        //a1.cattest();  //Cannot resolve method 'cattest' in 'Animal2'

        // 多态形式，创建对象
        Animal2 a2 = new Dog();
        // 调用的是 Dog 的 eat
        a2.eat();
        a2.testAnimal2();
        //a2.dogtest();  //Cannot resolve method 'dogtest' in 'Animal2'
    }
}

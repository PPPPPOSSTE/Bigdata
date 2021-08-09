package com.ftrue.day12test.exer.test05;

/**
 * @ClassName: Test05
 * @Description:
 * @Author: zhiqi zhang on 2021/7/12 19:18
 * @Version: 1.0
 */
//考核知识点：多态、重载、重写
public class Test05 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();
        System.out.println("(1)" + a1.show(b));
        System.out.println("(2)" + a2.show(d));
        System.out.println("(3)" + b.show(c));
        System.out.println("(4)" + b.show(d));
    }
}

//输出结果：
//(1)A and A
//(2)B and A  //注意此处，会调用重写方法
//(3)A and C
//(4)B and B

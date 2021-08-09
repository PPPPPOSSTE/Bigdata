package com.ftrue.day12test.inner.demo01;

/**
 * @ClassName: Outer
 * @Description:
 * @Author: zhiqi zhang on 2021/7/10 22:08
 * @Version: 1.0
 */
public class Outer {
    private static int a = 1;
    private int b = 2;
    private Inner inner;

    public Outer() {
    }

    public Outer(Inner inner) {
        this.inner = inner;
    }

    //和普通的类类似，不能在静态成员中使用非静态成员
    //非静态成员内部类当作外部类的非静态成员
    public static void outMethod() {
        //报错：'com.ftrue.day12test.demo01.Outer.this' cannot be referenced from a static context
        //Inner in = new Inner();
        System.out.println("外部类静态方法");
    }

    public void outerInsMethod() {
        System.out.println("外部类实例方法");
    }

    //可以在外部类中 new 非静态成员内部类
    //顺序可以是在非静态成员内部类之前或之后都可以
    public Inner getInner() {
        //不可以在外部类中访问非静态内部类成员的实例变量
        //e = 4;
        //不可以在外部类中访问非静态内部类成员的实例方法
        //inMethod();
        return new Inner();
    }


    //可以使用4中权限修饰符
    /*protected*/ class Inner extends Father {
        //非静态成员内部类中不可以定义静态成员
        //报错：Inner classes cannot have static declarations
        //static int d = 4;
        //报错：Inner classes cannot have static declarations
        /*static void method() {
            System.out.println("hello");
        }*/

        //可以定义实例成员变量
        private int b = 3;
        private int e;

        //可以定义实例成员方法
        void inMethod() {
            //可以访问外部类的静态成员变量（私有的也可以）
            System.out.println("out.a = " + a);
            //可以访问内部类的实例成员变量（私有的也可以）
            //注意这种使用方式：Outer.this.b
            System.out.println("out.b = " + Outer.this.b);
            System.out.println("out.b = " + Outer.this.b++);
            System.out.println("in.b = " + b);
            System.out.println("in.this.b = " + this.b);
            //可以内部类的父类的静态成员变量
            System.out.println("father.c = " + c);
        }

    }

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        Outer.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

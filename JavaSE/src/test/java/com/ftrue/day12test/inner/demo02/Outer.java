package com.ftrue.day12test.inner.demo02;

/**
 * @ClassName: Outer
 * @Description:
 * @Author: zhiqi zhang on 2021/7/12 8:35
 * @Version: 1.0
 */
public class Outer {
    private static int a = 1;
    private int b = 2;

    protected static class Inner {
        //静态成员内部类一般不定义实例变量
        int c = 3;
        //静态成员内部类一般只定义静态变量
        static int d = 4;
        private static int e = 4;

        //静态成员内部类一般不定义实例方法
        void inMethod() {
            System.out.println("out.a = " + a);
            //报错：Non-static field 'b' cannot be referenced from a static context
            //System.out.println("out.b = " + b);
        }

        //静态成员内部类一般只定义静态方法
        static void inTest() {
            System.out.println("out.a = " + a);
        }
    }

    public static void show() {
        System.out.println(Inner.d);
        System.out.println(Inner.e);
    }

}

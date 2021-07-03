package com.ftrue.day07test;

/**
 * @ClassName: OOPDemo03
 * @Description:
 * @Author: zhangzhiqi on 2021/7/3 19:41
 * @Version: 1.0
 */
public class OOPDemo03 {
    public static void main(String[] args) {
        ClassDemo cd1 = new ClassDemo();

        cd1.method();

        System.out.println("cd1 = " + cd1);
        cd1.show();

        ClassDemo cd2 = new ClassDemo();
        System.out.println("cd2 = " + cd2);
        cd2.show();

        System.out.println("=============================");

        Student s = new Student();
        //s就是对象的名字，后续还需要使用对象，可以使用s，不过因为堆内存中Student对象和栈内存中变量s具有指向性，s作为主方法的局部变量，JVM会在主方法结束后将堆内存中的Student对象当做垃圾数据

        new Student();
        //匿名对象，只允许被使用一次，因为和栈内存没有任何指向性，在使用完毕后马上就被当做垃圾数据
    }
}

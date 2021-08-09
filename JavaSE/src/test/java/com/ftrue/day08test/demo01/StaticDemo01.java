package com.ftrue.day08test.demo01;

/**
 * @ClassName: StaticDemo01
 * @Description:
 * @Author: zhangzhiqi on 2021/7/6 8:42
 * @Version: 1.0
 */
/*
* static关键字：
*       静态的，共享的
*
* static关键字可以用来修饰变量，方法，代码块
*
* 当一个属性需要被这个类所创建的对象所共享的时候，需要将该变量声明为static
*
* 静态变量：
*       定义在类中方法外，且含有static关键字修饰的变量
*
* 格式：
*       修饰符 static 数据类型 变量名;
*
* 含义：
*       被static修饰的变量不再属于对象本身，而是直接归属于类，会被
*
* 静态成员在内存中的特点：
*
*
*
* */
public class StaticDemo01 {
    public static void main(String[] args) {
        //创建三个学生对象
        Student.classroom = "射雕";

        Student s1 = new Student("郭靖", 20);
        Student s2 = new Student("黄蓉", 18);
        Student s3 = new Student("洪七公", 50);

        System.out.println(s1.print());
        System.out.println(s2.print());
        System.out.println(s3.print());

        System.out.println("==========================");

        Student.classroom = "神雕";

        System.out.println(s1.print());
        System.out.println(s2.print());
        System.out.println(s3.print());
    }
}

package com.ftrue.day10test.demo12;

/**
 * @ClassName: ExtendsDemo12
 * @Description:
 * @Author: zhiqi zhang on 2021/7/9 20:57
 * @Version: 1.0
 */
/**
 * Object类
 *      类的特点
 *          类 Object 是类层次结构的父类。
 *          每个类都使用 Object 作为父类。
 *          所有对象（包括数组）都实现这个类的方法。
 *          所有接口都继承Object类的接口形式
 *      类的位置
 *          java.lang
 *      类的构造器
 *          public Object()
 *              这个构造器一般情况下不是用来创建Object对象,
 *              而且在创建其它类的时候,用来初始Object类中的成员,
 *              供子类的super()进行使用
 *      类的方法
 *          public String toString()
 *              返回该对象的字符串表示。
 *          public final Class<?> getClass()
 *              返回此 Object 的运行时类。
 *          public boolean equals(Object obj)
 *              指示其他某个对象是否与此对象“相等”。
 *
 * Object类的注意事项:
 *      1.在Java中,打印所有的对象名或者数组名其实就是在隐式调用自己的toString().(char[]除外)
 *      2.== 和 equals()的区别:
 *          (1)== 既可以比较基本数据类型,也可以比较引用数据类型
 *              如果比较的是基本数据类型,比较的是基本数据类型的数据值
 *              如果比较的是引用数据类型,比较的是引用数据类型的内存地址值
 *          (2)equals()只能比较引用数据类型,不可以比较基本数据类型
 *              比较引用数据类型,比较的是引用数据类型的内存地址值
 *              如果某个类重写了Object类中的equals(),需要按照重写后的比较规则进行比较
 */
public class ExtendsDemo12 {
    public static void main(String[] args) {
        //创建学生对象
        Student s = new Student();
        System.out.println(s);
        System.out.println(s.toString());

        //创建int类型数组
        int[] ints = {11, 22, 33};
        System.out.println(ints);
        System.out.println(ints.toString());

        //创建char类型数组
        char[] chars = {'a', 'b', 'c'};
        System.out.println(chars);
        System.out.println(chars.toString());

        System.out.println("===============================");

        //获取对象在内存中的数据类型
        System.out.println(s.getClass());

        System.out.println("===============================");

        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(s1);
        System.out.println(s2);
        //判断对象的内存地址值是否相等
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
    }
}
//没有重写toString方法
/*com.ftrue.day10test.demo12.Student@1b6d3586
com.ftrue.day10test.demo12.Student@1b6d3586
[I@4554617c
[I@4554617c
abc
[C@74a14482
===============================
class com.ftrue.day10test.demo12.Student
===============================
com.ftrue.day10test.demo12.Student@1540e19d
com.ftrue.day10test.demo12.Student@677327b6
false
false*/


//重写toString方法
/*HelloWorld
HelloWorld
[I@1b6d3586
[I@1b6d3586
abc
[C@4554617c
===============================
class com.ftrue.day10test.demo12.Student
===============================
HelloWorld
HelloWorld
false
false*/

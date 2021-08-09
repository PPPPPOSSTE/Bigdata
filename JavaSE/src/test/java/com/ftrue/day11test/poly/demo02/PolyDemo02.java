package com.ftrue.day11test.poly.demo02;

/**
 * @ClassName: PolyDemo01
 * @Description:
 * @Author: zhiqi zhang on 2021/7/10 14:03
 * @Version: 1.0
 */
/*
* 多态性：
*   事物的多种形态
*   对象的不同的类型
*
*   在编译时时期和运行时，对象的数据类型是相同，称之为”单态“
*       例如：Cat cat = new Cat();
*   在编译时时期和运行时，对象的数据类型是不相同，称之为”多态“
*       例如：Animal cat = new Cat();
*
* 多态的前提条件：
*   1.要有”继承关系“或者”实现关系“
*   2.要有方法的重写（如果没有重写，也可以构成多态的格式，但是这样的多态没有任何意义）
*   3.格式：满足其中一点即可
*       继承关系：
*       实现关系：
*       特殊关系：初始化子类对象的时候，super(),(不作为重点)
*
* 在多态的情况下，类中的成员会发生怎样的变化
*
*
*
*
* */
public class PolyDemo02 {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        System.out.println(superClass);
        System.out.println(superClass.num);
        System.out.println("========================");

        SubClass subClass = new SubClass();
        System.out.println(subClass);
        System.out.println(subClass.num);
        System.out.println("======================");

        //父new子 变量sc在内存中的数据类型是SubClass，在代码中的数据类型是SuperClass
        SuperClass sc = new SubClass();
        System.out.println(sc);
        System.out.println(sc.num);
        System.out.println("==============================");

        int a = 'a';
        System.out.println(a);
        char c = 97;
        System.out.println(c);

        //打印的内容是什么取决于变量的数据类型

    }
}



























package com.ftrue.suggestion151;

import java.util.Scanner;

/**
 * @ClassName: sugg26
 * @Description:
 * @Author: zhangzhiqi on 2021/7/2 8:48
 * @Version: 1.0
 */
//建议28：优先使用整型池
//理解整型池原理
//  Integercache类中有静态常量Integer数组 值的范围为-128~127

//整型池的存在可以提高系统性能，节约内存空间

//因此在声明初始化包装对象时，应该使用valueOf生成或常量赋值生成，而不要用构造函数来生成。

public class sugg28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            int i = input.nextInt();
            System.out.println("\n====" + i + " 的相等判断====");
            //两个通过new产生的Integer对象
            Integer n1 = new Integer(i);
            Integer n2 = new Integer(i);
            System.out.println("new 产生的对象：" + (n1 == n2));

            //基本类型转为包装类型后比较
            n1 = i;
            n2 = i;
            System.out.println("基本类型转换的对象：" + (n1 == n2));

            //通过静态方法生成一个实例
            n1 = Integer.valueOf(i);
            n2 = Integer.valueOf(i);
            System.out.println("valueOf产生的对象：" + (n1 == n2));
        }
    }
}
/*
100 127 128 555 1000

====100 的相等判断====
new 产生的对象：false
基本类型转换的对象：true
valueOf产生的对象：true

====127 的相等判断====
new 产生的对象：false
基本类型转换的对象：true
valueOf产生的对象：true

====128 的相等判断====
new 产生的对象：false
基本类型转换的对象：false
valueOf产生的对象：false

====555 的相等判断====
new 产生的对象：false
基本类型转换的对象：false
valueOf产生的对象：false

====1000 的相等判断====
new 产生的对象：false
基本类型转换的对象：false
valueOf产生的对象：false
*/

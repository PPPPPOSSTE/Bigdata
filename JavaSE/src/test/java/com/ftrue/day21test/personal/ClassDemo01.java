package com.ftrue.day21test.personal;

import java.lang.annotation.ElementType;

/**
 * @ClassName: ClassDemo01
 * @Description:
 * @Author: zhiqi zhang on 2021/7/23 22:31
 * @Version: 1.0
 */
//所有的java类型都可以获取Class对象
public class ClassDemo01 {
    public static void main(String[] args) {
        //基本数据类型和void
        System.out.println(int.class);  //int
        System.out.println(void.class);  //void

        //类和接口
        System.out.println(String.class);
        System.out.println(Comparable.class);
        //class java.lang.String
        //interface java.lang.Comparable

        //枚举
        System.out.println(ElementType.class);
        //class java.lang.annotation.ElementType

        //注解
        System.out.println(Override.class);
        //interface java.lang.Override

        //数组
        System.out.println(int[].class);
        //class [I
        System.out.println(String[].class);
        //class [Ljava.lang.String;
    }
}

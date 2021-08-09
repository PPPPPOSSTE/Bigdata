package com.ftrue.day14test.integer;

/**
 * @ClassName: IntegerDemo01
 * @Description:
 * @Author: zhiqi zhang on 2021/7/14 8:51
 * @Version: 1.0
 */
/*
 *
 * 包装类:
 *      其实就是八种基本数据类型对应的引用数据类型的形式
 *
 * 基本数据类型
 *      byte,short,int,long,float,double,boolean,char
 * 引用数据类型
 *      Byte,Short,Integer,Long,Float,Double,Boolean,Character
 *
 * 学习包装类的目的:
 *      1.类型转换
 *          基本数据类型和对应的包装类型之间的转换
 *          基本数据类型和字符串类型之间的转换
 *      2.笔试题
 *
 * =================================================================
 *
 * 基本数据类型和对应的包装类型之间的转换(以Integer为例)
 *      将基本数据类型转换为对应的包装类型(装箱)
 *          1.包装类型的构造器
 *          2.包装类型的静态方法valueOf(基本数据类型数据)
 *          3.自动装箱(稍后)
 *      将包装类型转换为对应的基本数据类型(拆箱)
 *          1.包装类型的实例方法xxxValue(),备注:xxx就是基本数据类型
 *          2.自动拆箱(稍后)
 * ==================================================================
 *
 * 自动装箱和自动拆箱(JDK5.0)
 *      自动装箱:JVM可以将基本数据类型的数据直接转换为对应包装类型的数据
 *      自动拆箱:JVM可以将包装类型的数据直接转换为对应基本数据类型的数据
 *
 * =====================================================================
 *
 * 基本数据类型和字符串类型之间的转换
 *      将基本数据类型的数据转换成字符串类型的对象
 *          1.字符串连接符
 *          2.包装类型的实例方法toString()
 *          3.包装类型的静态方法toString(基本数据类型的数据)
 *          4.字符串String的静态方法valueOf(基本数据类型的数据)(推荐)
 *      将字符串类型的对象转换成基本数据类型的数据(Character除外)
 *          1.包装类型的构造器,再进行自动拆箱
 *          2.包装类型的静态方法parseXxx(字符串类型的对象) 备注:Xxx就是对应的基本数据,首字母大写 (推荐)
 *
 *
 *
 * */
public class IntegerDemo04 {
    public static void main(String[] args) {

        //将基本数据类型的数据转换成字符串类型的对象
        //方式1：字符串拼接
        //备注：字符串连接符相当于new，先在堆创建StringBuilder，再将StringBuilder转换为String
        String str1 = 123 + "";
        System.out.println("str1 = " + str1);

        //方式2：包装类型的实例方法toString()
        Integer integer = 123;
        String str2 = integer.toString();
        System.out.println("str2 = " + str2);

        //方式3：包装类型的静态方法toString(基本数据类型的数据)
        String str3 = Integer.toString(123);
        System.out.println("str3 = " + str3);

        //方式4：String类的静态方法valueOf(基本数据类型的数据) 【推荐】
        String str4 = String.valueOf(123);
        System.out.println("str4 = " + str4);

        System.out.println("==========================");

        //将字符串类型的对象转换成基本数据类型的数据(Character除外)
        //方式1：包装类型的构造器，再进行自动拆箱
        int num1 = new Integer("123");
        System.out.println("num1 = " + num1);

        //方式2：包装类型的静态方法parseXxx(字符串对象)  Xxx为基本数据类型 【推荐】
        int num2 = Integer.parseInt("123");
        System.out.println("num2 = " + num2);

    }

}

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
 *
 *
 * */
public class IntegerDemo03 {
    public static void main(String[] args) {

        //包装类型对象的获取方式
        //方式1：自动装箱  【推荐】
        //自动装箱：JVM可以将基本类型的数据直接转换为对应包装类型的数据
        Integer integer = 123;

        //方式2：构造器
        Integer integer1 = new Integer(123);
        Integer integer2 = new Integer("123");

        //方式3：静态方法valueOf
        Integer integer3 = Integer.valueOf(123);
        Integer integer4 = Integer.valueOf("123");

        System.out.println(integer);
        System.out.println(integer1);
        System.out.println(integer2);
        System.out.println(integer3);
        System.out.println(integer4);

        System.out.println("==========================");


        //包装类型对象转换为基本类型
        //方式1：自动拆箱  【推荐】
        //自动拆箱：JVM可以将包装类型的数据直接转换为对应基本类型的数据
        int num = integer;

        //方式2：实例方法intValue()
        int intValue = integer.intValue();

    }

}

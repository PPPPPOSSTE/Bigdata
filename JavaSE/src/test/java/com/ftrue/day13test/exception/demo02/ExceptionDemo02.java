package com.ftrue.day13test.exception.demo02;

/**
 * @ClassName: ExceptionDemo01
 * @Description:
 * @Author: zhiqi zhang on 2021/7/13 8:45
 * @Version: 1.0
 */
/*
 *
 * 程序中常见错误类型：
 *     语法格式错误
 *       idea
 *     程序逻辑错误
 *       idea中debug
 *     程序中的异常
 *       异常处理
 *
 * 异常：
 *     在程序运行的过程中，出现了非正常的情况，从而导致JVM终止
 *
 *
 * Throwable体系结构:
 *      Error(错误)
 *          错误比喻程序的"绝症",是程序员无法根治的,只能事先避免
 *      Exception(异常)
 *          异常比喻程序中的"小毛病",是程序员可以通过代码可以直接进行修复,可以解决
 *
 *
 * Throwable类:
 *      类的特点
 *          Throwable 类是 Java 语言中所有错误或异常的父类
 *      类的位置
 *          java.lang
 *      类的构造器
 *          public Throwable()
 *              构造一个将 null 作为其详细消息的新 throwable。
 *          public Throwable(String message)
 *              构造带指定详细消息的新 throwable
 *      类的方法
 *          public String getMessage()
 *              返回此 throwable 的详细消息字符串。
 *          public void printStackTrace()
 *              将此 throwable 及其追踪输出至标准错误流。
 *
 *
 * */
public class ExceptionDemo02 {
    public static void main(String[] args) {
        //创建Throwable对象
        Throwable t = new Throwable("自定义Throwable");

        //打印Throwable对象的详细信息
        t.printStackTrace();
        System.out.println("=========================");
        String message = t.getMessage();
        System.out.println(message);

        System.out.println("之前");  //会执行

        //运行时异常：ArrayIndexOutOfBoundsException
        System.out.println(args[10]);

        System.out.println("之后");  //不会执行
    }
}


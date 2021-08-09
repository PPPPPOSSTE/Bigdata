package com.ftrue.day13test.exception.demo03;

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
 * ==============================================================
 *
 * 异常的分类
 *      编译时异常
 *          代码没有语法格式错误,异常发生在编译时期,导致编译报错
 *      运行时异常
 *          代码没有语法格式错误,异常发生在运行时期,导致程序终止
 *
 *
 * 异常处理:
 *      编译时异常:
 *          程序员必须手动解决
 *          解决方案:
 *              异常声明
 *              异常捕获
 *      运行时异常:
 *          程序员可以手动解决,也可以交给JVM进行解决
 *          解决方案:
 *              手动解决(异常声明或者异常捕获)
 *              JVM解决(执行两步：1.调用printStackTrace() 2.结束JVM)
 *
 * */
public class ExceptionDemo03 {
    public static void main(String[] args) {
        System.out.println(1 / 0);
    }
}































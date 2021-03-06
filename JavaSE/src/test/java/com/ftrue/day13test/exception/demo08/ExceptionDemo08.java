package com.ftrue.day13test.exception.demo08;

import java.util.Scanner;

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
 * ================================================================
 *
 * 异常处理:
 *      异常抛出:throw
 *      异常声明:throws
 *      异常捕获:try,catch,finally
 *
 *
 * 异常的抛出:
 *      异常对象进行创建,并且让异常对象在JVM所有的对象中脱颖而出
 *
 * 格式:
 *      throw new 异常类名(实参);
 *
 *
 * 异常的声明:
 *      含义:在出现异常的方法上进行异常的声明,交给该方法的调用者进行异常的处理
 *      格式:
 *          修饰符 返回值类型 方法名 () throws 异常类名1,异常类名2,......,异常类名n {
 *
 *          }
 *
 * ===============================================================
 *
 * 声明异常的注意事项（存在多个异常）
 *          1.在进行异常声明的时候,多个异常类的前后顺序可以随意颠倒
 *          2.在进行异常声明的时候,可以将多个异常类进行省略,直接声明父类异常即可
 *              备注:今后方法声明的时候,可能声明10个异常,且10个异常类没有互相继承关系,当声明的异常类超过5个以上时候,建议直接声明Exception
 *
 * 抛出异常的方法在重写情形下的注意事项（有点不好理解为什么这样，记住即可）
 *          异常存在于父类被重写的方法中
 *              当子类重写父类含有异常的方法时,无需理会该异常信息
 *          异常存在于子类重写后的方法中
 *              此时不能通过声明异常的方式处理异常。异常处理方案只有唯一的一种,就是异常的捕获
 *
 * ===============================================================
 *
 * 异常的捕获:
 *      格式:
 *          try {
 *              可能存在异常的代码
 *          } catch (异常类名 对象名) {
 *              解决方案
 *          }
 *
 *
 *      执行流程:
 *          1.执行try{}中的代码,看是否会发生异常
 *          2.如果没有发生异常,异常捕获语句结束,继续往下执行;
 *            如果发生异常,JVM自动匹配到对应的catch()中异常,执行{}中的解决方案,异常捕获语句结束,继续往下执行;
 *
 * =================================================================
 *
 * 异常捕获的注意事项（存在多个异常）
 *      程序中出现的异常存在子父类继承关系
 *          1.针对多个异常进行分别捕获,分别处理
 *          2.针对多个异常进行一次捕获,分别处理
 *              注意:需要子类异常进行先处理,父类异常进行后处理,否则编译报错
 *          3.针对多个异常进行一次捕获,一次处理
 *
 * =================================================================
 *
 * finally关键字
 *      格式:
 *          try {
 *              可能出现异常的代码
 *          } catch (异常类名 对象名) {
 *              解决方案
 *          } finally {
 *              必须执行的代码
 *          }
 *
 *      无论是否发生异常,finally里面的代码都会执行
 *
 * */
public class ExceptionDemo08 {
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner sc = null;

        try {
            sc = new Scanner(System.in);

            //友情提示
            System.out.println("请键盘录入一个整数");
            //调用键盘录入整数的方法
            int num = sc.nextInt();

            System.out.println("num = " + num);
        } catch (Exception e) {
            System.out.println("解决方案");
        } finally {
            //关闭资源
            if (sc != null) {
                System.out.println("关闭资源");
                sc.close();
            }
        }

    }
}































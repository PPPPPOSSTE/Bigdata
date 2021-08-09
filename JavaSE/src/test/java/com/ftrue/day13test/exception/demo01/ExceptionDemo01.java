package com.ftrue.day13test.exception.demo01;

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
 * */
public class ExceptionDemo01 {
    public static void main(String[] args) {
        System.out.println("开始");

        //运行时异常：ArithmeticException
        //System.out.println(1 / 0);

        try {
            System.out.println("1 / 0");
            System.out.println(1 / 0);
        } catch (Exception e) {
            System.out.println("后续的操作，解决方案");
            e.printStackTrace();
        }

        System.out.println("结束");
    }
}































package com.ftrue.day11test;

/**
 * @ClassName: FinalDemo01
 * @Description:
 * @Author: zhangzhiqi on 2021/7/5 18:11
 * @Version: 1.0
 */
public class FinalDemo01 {
    public static void main(String[] args) {

        // 声明变量，使用final修饰
        final int a;
        // 第一次赋值
        a = 10;
        // 第二次赋值
        //a = 20; // 报错,不可重新赋值
        // 声明变量，直接赋值，使用final修饰
        final int b = 10;
        // 第二次赋值
        //b = 20; // 报错,不可重新赋值

        /*final int c = 0;
        for (int i = 0; i < 10; i++) {
            c = i;
            System.out.println(c);
        }*/

        for (int i = 0; i < 10; i++) {
            final int c = i;
            System.out.println(c);
        }
    }
}

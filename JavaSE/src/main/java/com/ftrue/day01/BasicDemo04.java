package com.ftrue.day01;

/**
 * @ClassName: BasicDemo04
 * @Description:
 * @Author: zhangzhiqi on 2021/6/26 19:30
 * @Version: 1.0
 */
/*
	练习：定义所有基本数据类型的变量和字符串变量并输出
*/
public class BasicDemo04 {
    public static void main (String[] args) {
        //声明初始化整数类型变量
        byte num01 = 123;
        System.out.println(num01);
        short num02 = 12345;
        System.out.println(num02);
        int num03 = 1234567890;
        System.out.println(num03);
        long num04 = 12345678900L;
        System.out.println(num04);
        //声明初始化浮点类型变量
        float num05 = 12.34F;
        System.out.println(num05);
        double num06 = 56.78;
        System.out.println(num06);
        //声明初始化字符类型变量
        char num07 = 'a';
        System.out.println(num07);
        //声明初始化布尔类型变量
        boolean num08 = false;
        System.out.println(num08);

        //声明初始化字符串变量
        String num09 = "HelloWorld";
        System.out.println(num09);
    }
}

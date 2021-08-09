package com.ftrue.day13test.big;

import java.math.BigDecimal;

/**
 * @ClassName: BigDemo01
 * @Description:
 * @Author: zhiqi zhang on 2021/7/13 20:37
 * @Version: 1.0
 */
/*
 *
 * BigDecimal类
 *      类的特点
 *          不可变的、任意精度的有符号十进制数
 *      类的位置
 *          java.math
 *      类的构造器
 *          public BigDecimal(String val)
 *              将 BigDecimal 的字符串表示形式转换为 BigDecimal。
 *      类的方法
 * */
public class BigDemo02 {
    public static void main(String[] args) {
        BigDecimal num01 = new BigDecimal("2.0");
        BigDecimal num02 = new BigDecimal("1.1");
        BigDecimal num03 = num01;

        BigDecimal result = num01.subtract(num02);
        num01 = num01.subtract(num02);
        System.out.println("result = " + result);
        System.out.println(num01);
        System.out.println(num01 == num03);  //false  验证了不可变

    }
}

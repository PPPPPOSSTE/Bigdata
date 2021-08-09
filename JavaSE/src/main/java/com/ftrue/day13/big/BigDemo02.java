package com.ftrue.day13.big;

import java.math.BigDecimal;

/**
 * @ClassName BigDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月13日 16时40分
 * @Version 1.0
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
 *
 */
public class BigDemo02 {
	public static void main(String[] args) {
		BigDecimal num01 = new BigDecimal("2.0");
		BigDecimal num02 = new BigDecimal("1.1");

		BigDecimal result = num01.subtract(num02);
		System.out.println("result = " + result);
	}
}

package com.ftrue.day13.big;

import java.math.BigInteger;

/**
 * @ClassName BigDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月13日 16时33分
 * @Version 1.0
 *
 *
 * BigInteger类
 *      类的特点
 *          可变的任意精度整数(操作比long取值范围更大的整数工具类)
 *      类的位置
 *          java.math
 *      类的构造器
 *          public BigInteger(String val)
 *              将 BigInteger 的十进制字符串表示形式转换为 BigInteger。
 *      类的方法
 *          public BigInteger add(BigInteger val)
 *              返回其值为 (this + val) 的 BigInteger。
 *
 */
public class BigDemo01 {
	public static void main(String[] args) {
		//需求:声明一个比long取值范围更大的数据
		//long num = 12345678901234567890L;
		BigInteger num01 = new BigInteger("12345678901234567890");
		BigInteger num02 = new BigInteger("1");
		BigInteger sum = num01.add(num02);

		System.out.println("sum = " + sum);
	}
}

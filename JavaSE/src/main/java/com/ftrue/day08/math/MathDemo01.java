package com.ftrue.day08.math;

/**
 * @ClassName MathDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月06日 16时51分
 * @Version 1.0
 *
 * Math类:
 *      类的特点
 *          数学工具类
 *      类的位置
 *          java.lang
 *      类的构造器
 *          构造器私有化
 *      类的方法
 *          public static double random()
 *              返回带正号的 double 值，该值大于等于 0.0 且小于 1.0。
 *
 * 随机生成指定范围的整数:
 *      (int)(Math.random() * x + y)
 *      x : 这个范围一共有多少个数,这个x就是多少
 *      y : 这个范围的起始数字
 *
 */
public class MathDemo01 {
	public static void main(String[] args) {
		//需求:在0-99范围内随机生成一个整数
		System.out.println((int)(Math.random() * 100));
		//需求:在1-100范围内随机生成一个整数
		System.out.println((int)(Math.random() * 100 + 1));
		//需求:在5-8范围内随机生成一个整数
		System.out.println((int)(Math.random() * 4 + 5));
		//需求:在8-15范围内随机生成一个整数
		System.out.println((int)(Math.random() * 8 + 8));

	}
}

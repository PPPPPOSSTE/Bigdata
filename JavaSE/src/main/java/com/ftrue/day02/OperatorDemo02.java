package com.ftrue.day02;

/*
	练习：获取一个四位数的个位，十位，百位，千位

	分析:
		1.声明初始化一个四位整数
		2.分别求出四位数的个位，十位，百位，千位
		3.分别打印四位数的个位，十位，百位，千位

	规律:
		求一个整数某个位上数字其实就用这个数除以这个位上的权重,对10进行取余运算
*/

public class OperatorDemo02 {
	public static void main (String[] args) {
		//1.声明初始化一个四位整数
		int num = 1234;

		//2.分别求出四位数的个位，十位，百位，千位
		int ge = num / 1 % 10;
		int shi = num / 10 % 10;
		int bai = num / 100 % 10;
		int qian = num / 1000 % 10;

		//3.分别打印四位数的个位，十位，百位，千位
		System.out.println("四位数个位上数字是:" + ge);
		System.out.println("四位数十位上数字是:" + shi);
		System.out.println("四位数百位上数字是:" + bai);
		System.out.println("四位数千位上数字是:" + qian);
	}
}
package com.ftrue.day02;

/*
	关系运算符:
		< <= > >= == !=

	注意事项:
		关系表达式的结果一定是boolean值
		千万不要将==写成=或者不要将=写成==

	==判断两个基本数据类型的数据值是否相等
	!=判断两个基本数据类型的数据值是否不等
*/

public class OperatorDemo04 {
	public static void main (String[] args) {
		int a = 3;
		int b = 4;
		int c = 4;

		System.out.println(a < b);//true
		System.out.println(b < c);//false
		System.out.println("========================");
		System.out.println(a <= b);//true
		System.out.println(b <= c);//true
		System.out.println("========================");
		System.out.println(a > b);//false
		System.out.println(b > c);//false
		System.out.println("========================");
		System.out.println(a >= b);//false
		System.out.println(b >= c);//true
		System.out.println("========================");
		System.out.println(a == b);//false
		System.out.println(b == c);//true
		System.out.println("========================");
		System.out.println(a != b);//true
		System.out.println(b != c);//false

		System.out.println("========================");
		System.out.println(a = b);
	}
}
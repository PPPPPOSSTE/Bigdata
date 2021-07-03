package com.ftrue.day02;

/*
	逻辑运算符:
		& | ^ ! && ||
*/

public class OperatorDemo05 {
	public static void main (String[] args) {
		int a = 3;
		int b = 4;
		int c = 5;

		//& 与,且	含义:有false则false	作用:同时满足N个条件
		System.out.println((a > b) & (a > c));//false & false
		System.out.println((a > b) & (a < c));//false & true
		System.out.println((a < b) & (a > c));//true & false
		System.out.println((a < b) & (a < c));//true & true
		System.out.println("=============================================");

		//|	或	含义:有true则true	作用:满足一个条件即可
		System.out.println((a > b) | (a > c));//false | false
		System.out.println((a > b) | (a < c));//false | true
		System.out.println((a < b) | (a > c));//true | false
		System.out.println((a < b) | (a < c));//true | true
		System.out.println("=============================================");

		//^ 异或 含义:相同则false,不同则true 作用:判断两个布尔值是否不相同
		System.out.println((a > b) ^ (a > c));//false ^ false
		System.out.println((a > b) ^ (a < c));//false ^ true
		System.out.println((a < b) ^ (a > c));//true ^ false
		System.out.println((a < b) ^ (a < c));//true ^ true
		System.out.println("=============================================");

		//!非 含义:非true则false,非false则true
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!!true);
	}
}
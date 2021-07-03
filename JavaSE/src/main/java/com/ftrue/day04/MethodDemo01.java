package com.ftrue.day04;

/*
	方法:在程序中执行特殊功能的代码块

	方法的好处:
		1.提高代码的复用性,从而提高开发效率
		2.降低代码的耦合性
			写代码的规则:尽量拆分
*/

public class MethodDemo01 {
	public static void main (String[] args) {
		method(5);
		System.out.println("趣味折纸");

		method(10);
		System.out.println("水仙花数");

		method(6);
		System.out.println("百钱买百鸡");

		method(8);
	}


	public static void method (int num) {
		for (int i = 1; i <= num ;i++ ) {
			System.out.println("HelloWorld");
		}
	}
}
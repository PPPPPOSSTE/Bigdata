package com.ftrue.day04;

/*
	死循环:永远无法停止的循环语句

	常见的死循环结构
		for死循环
		while死循环


	for的死循环格式:
		for (;;) {
			循环体语句
		}

	while的死循环格式:
		while (true) {
			循环体语句
		}

	在实际开发中,更推荐使用while循环的死循环格式
	在开发计算机语言源码,框架,设计模式,算法等,更推荐使用for循环的死循环格式,效率更高
*/

public class BasicDemo03 {
	public static void main (String[] args) {
		/*
		for (;;) {
			System.out.println("HelloWorld");
		}
		*/

		while (true) {
			System.out.println("HelloWorld");
		}
	}
}
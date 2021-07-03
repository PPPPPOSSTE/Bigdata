package com.ftrue.day02;

/*
	常量:
		在程序运行的过程中,其值不可以发生改变的量

	常量的分类:
		自定义常量(面向对象的时候讲解)
		字面值常量
			就是单独的一个值,没有任何的实际意义,需要借助其它语句进行使用

	字面值常量分类
		字符串字面值常量
		整数字面值常量
		小数字面值常量
		字符字面值常量
		布尔字面值常量
		空字面值常量(后面讲解)
			null不可以用输出语句直接进行打印
*/

public class BasicDemo04 {
	public static void main (String[] args) {
		//字符串字面值常量
		System.out.println("HelloWorld");
		//整数字面值常量
		System.out.println(123);
		//小数字面值常量
		System.out.println(3.14);
		//字符字面值常量
		System.out.println('a');
		//布尔字面值常量
		System.out.println(false);
	}
}
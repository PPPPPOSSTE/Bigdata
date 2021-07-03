package com.ftrue.day04;

/*
	流程控制语句的注意事项:
		流程控制语句的语句体有且仅有一条的时候,{}可以省略不写,在实际开发中不推荐这种写法
*/

public class BasicDemo01 {
	public static void main (String[] args) {
		System.out.println("开始");

		if (false)
			System.out.println("Hello");
		System.out.println("World");


		System.out.println("结束");
	}
}
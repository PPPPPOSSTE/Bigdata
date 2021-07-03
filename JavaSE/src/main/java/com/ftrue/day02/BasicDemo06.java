package com.ftrue.day02;

/*
	两种常见的输出语句:
		直接输出语句:输出内容,不后续处理
			System.out.print(输出内容);
		换行输出语句:输出内容,然后做换行处理
			System.out.println(输出内容);

	注意事项:
		1.换行输出语句如果没有任何输出内容,直接做换行处理
		2.直接输出语句如果没有任何输出内容,编译报错
*/

public class BasicDemo06 {
	public static void main (String[] args) {
		System.out.println("Hello");
		//System.out.print();
		System.out.println("World");
	}
}
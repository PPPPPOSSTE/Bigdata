package com.ftrue.day11.fin.demo05;

/**
 * @ClassName SubClass
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月10日 09时05分
 * @Version 1.0
 */
public class SubClass {
	//直接声明初始化
	//public static final int num = 10;
	//先声明后初始化
	public static final int num;

	static {
		num = 10;
	}
}

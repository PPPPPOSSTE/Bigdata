package com.ftrue.day11.fin.demo04;

/**
 * @ClassName SubClass
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月10日 08时58分
 * @Version 1.0
 */
public class SubClass {
	//直接声明初始化
	//public final int num = 10;
	//先声明后初始化
	public final int num;

	public SubClass () {
		num = 10;
	}

	public SubClass (int a) {
		num = 20;
	}

}

package com.ftrue.day12.init.demo01;

/**
 * @ClassName SubClass
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月12日 14时01分
 * @Version 1.0
 */
public class SubClass {
	//实例变量
	int num = method();

	public int method () {
		System.out.println("实例变量的显式初始化");
		return 10;
	}

	//构造器
	public SubClass() {
		//隐式代码(实例初始化)
		//显式代码(赋值)
		System.out.println("构造器中的显式代码");
	}

	{
		System.out.println("构造器代码块");
	}

}

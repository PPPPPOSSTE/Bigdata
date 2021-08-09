package com.ftrue.day12.init.demo02;

/**
 * @ClassName SuperClass
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月12日 14时16分
 * @Version 1.0
 */
public class SuperClass {
	int superVar = method();

	private int method() {
		System.out.println("父类的实例变量的显式初始化");
		return 10;
	}

	public SuperClass() {
		//隐式代码
		//1.super() 2.实例变量的显式初始化或者构造器代码块
		//显式代码
		System.out.println("父类的无参构造器中显式代码");
	}

	{
		System.out.println("父类的构造器代码块");
	}
}

package com.ftrue.day12.init.demo04;

/**
 * @ClassName SubClass
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月12日 15时24分
 * @Version 1.0
 */
public class SubClass {
	static int a = method();
	int b = show();

	private int show() {
		System.out.println("子类的实例变量显式初始化");
		return 20;
	}

	private static int method() {
		System.out.println("子类的静态变量显式初始化");
		return 10;
	}

	static {
		System.out.println("子类的静态代码块");
	}

	public SubClass() {
		System.out.println("子类的无参构造器中显式代码");
	}

	{
		System.out.println("子类的构造器代码块");
	}
}

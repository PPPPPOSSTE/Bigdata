package com.ftrue.day12.init.demo05;

/**
 * @ClassName SuperClass
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月12日 15时34分
 * @Version 1.0
 */
public class SuperClass {
	static int a = method();
	int b = show();

	private int show() {
		System.out.println("父类的实例变量显式初始化");
		return 20;
	}

	private static int method() {
		System.out.println("父类的静态变量显式初始化");
		return 10;
	}

	public SuperClass() {
		System.out.println("父类的无参构造器中显式代码");
	}

	{
		System.out.println("父类的构造器代码块");
	}

	static {
		System.out.println("父类的静态代码块");
	}
}

package com.ftrue.day12.init.demo02;

/**
 * @ClassName SuperClass
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月12日 14时16分
 * @Version 1.0
 */
public class SubClass extends SuperClass{
	int subVar = show();
	//SubClass sc = new SubClass();

	private int show() {
		System.out.println("子类的实例变量的显式初始化");
		return 10;
	}

	public SubClass() {
		//隐式代码(实例初始化过程:(1)super(2)实例变量的显式初始化或构造器代码块)
		super();

		//显式代码
		System.out.println("子类的无参构造器中显式代码");
	}

	{
		System.out.println("子类的构造器代码块");
	}
}

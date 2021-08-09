package com.ftrue.day12.init.demo03;

/**
 * @ClassName SubClass
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月12日 14时36分
 * @Version 1.0
 */
public class SubClass extends SuperClass{
	int num = 20;

	public SubClass() {
		super();
		//2 子类实例变量显式初始化
	}

	public void method () {
		System.out.println("num = " + num);
	}
}

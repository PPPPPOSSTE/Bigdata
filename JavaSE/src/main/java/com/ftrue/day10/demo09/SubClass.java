package com.ftrue.day10.demo09;

/**
 * @ClassName SubClass
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月09日 11时37分
 * @Version 1.0
 */
public class SubClass extends SuperClass {
	public SubClass() {

		System.out.println("子类的无参构造器");

	}

	public SubClass(int num) {
		super(num);
	}
}

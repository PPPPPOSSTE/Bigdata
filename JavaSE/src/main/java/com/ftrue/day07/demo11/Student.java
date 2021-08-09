package com.ftrue.day07.demo11;

/**
 * @ClassName Student
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月05日 16时15分
 * @Version 1.0
 */
public class Student {
	public Student () {
		//隐式代码中调用构造器代码块
		System.out.println(5);
	}

	public Student (int a) {
		//隐式代码中调用构造器代码块
		System.out.println(8);
	}

	{
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
	}
}

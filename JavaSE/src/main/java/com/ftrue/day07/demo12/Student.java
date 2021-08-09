package com.ftrue.day07.demo12;

/**
 * @ClassName Student
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月05日 16时31分
 * @Version 1.0
 */
public class Student {
	public Student () {
		//隐式代码:实例初始化过程(外包:一个参)
		this(1);
		//显式代码:自己写的代码
		System.out.println("无参构造器");
	}

	public Student (int a) {
		//隐式代码:实例初始化过程(外包:两个参)
		this(1,2);
		//显式代码:自己写的代码
		System.out.println("一个参数的构造器");
	}

	public Student (int a , int b) {
		//隐式代码:实例初始化过程(完成)

		//显式代码:自己写的代码
		System.out.println("两个参数的构造器");
	}


	{
		System.out.println("构造器代码块");
	}
}

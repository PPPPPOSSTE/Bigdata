package com.ftrue.day07.demo06;

/**
 * @ClassName Student
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月05日 14时35分
 * @Version 1.0
 */
public class Student {
	//私有化实例变量
	private String name;
	private int age;

	//提供公共的访问方式
	public void setName (String name) {
		this.name = name;
	}

	public String getName () {
		return name;
	}

	public void setAge (int age) {
		this.age = age;
	}

	public int getAge () {
		return age;
	}

	//无参构造器
	public Student () {}

	//有参构造器
	public Student (String name, int age) {
		this.name = name;
		this.age = age;
	}
}

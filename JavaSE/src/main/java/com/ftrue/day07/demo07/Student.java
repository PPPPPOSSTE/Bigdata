package com.ftrue.day07.demo07;

/**
 * @ClassName Student
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月05日 15时21分
 * @Version 1.0
 */
public class Student {
	//私有化实例变量
	private String name;
	private int age;

	//公共的访问方式
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//无参构造器
	public Student() {
	}

	//满参构造器

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

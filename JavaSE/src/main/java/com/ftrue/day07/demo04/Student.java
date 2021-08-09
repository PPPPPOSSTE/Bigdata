package com.ftrue.day07.demo04;

/**
 * @ClassName Student
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月05日 11时41分
 * @Version 1.0
 */
public class Student {
	//私有化实例变量
	private String name;
	private int age;

	//set和get
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

	//学生的实例方法
	public void study () {
		System.out.println(age + "岁的" + name + "正在好好学习,天天向上");
	}
}

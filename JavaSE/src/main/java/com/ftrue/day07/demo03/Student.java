package com.ftrue.day07.demo03;

/**
 * @ClassName Student
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月05日 11时23分
 * @Version 1.0
 */
public class Student {
	private String name;
	private int age;

	/*if (age < 0) {
		System.out.println("年龄不能为负数");
	}*/

	/*
		存储姓名的方法
	*/
	public void setName (String name) {
		this.name = name;
	}

	/*
		获取姓名的方法
	*/
	public String getName () {
		//return this.name;
		return name;
	}

	/*
		存储年龄的方法
	*/
	public void setAge (int age) {
		this.age = age;
	}

	/*
		获取年龄的方法
	*/
	public int getAge () {
		return age;
	}
}

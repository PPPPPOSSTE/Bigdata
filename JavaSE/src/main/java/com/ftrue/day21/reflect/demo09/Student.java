package com.ftrue.day21.reflect.demo09;

/**
 * @ClassName Student
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月24日 09时14分
 * @Version 1.0
 */
public class Student {
	private String name;
	private int age;

	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String print () {
		return "Student{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	public void eat (String something) {
		System.out.println("吃" + something);
	}
}

package com.ftrue.day18.io.object;

import java.io.Serializable;

/**
 * @ClassName Student
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月20日 15时17分
 * @Version 1.0
 */
public class Student implements Serializable {
	private transient String name;
	private int age;


	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

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

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}

package com.ftrue.day08.sta.demo01;

/**
 * @ClassName Student
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月06日 10时18分
 * @Version 1.0
 */
public class Student {
	private String name;
	private int age;
	/*private */static String classroom;//教室

	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/*public Student(String name, int age, String classroom) {
		this.name = name;
		this.age = age;
		this.classroom = classroom;
	}*/

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

	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public String print () {
		return name + "=" + age + "=" + classroom;
	}
}

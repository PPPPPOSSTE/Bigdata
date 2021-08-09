package com.ftrue.day16.set.demo07;

/**
 * @ClassName Student
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月17日 15时14分
 * @Version 1.0
 */
public class Student implements Comparable<Student>{
	private String name;
	private int age;
	private int id;

	public Student() {
	}

	public Student(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", age=" + age +
				", id=" + id +
				'}';
	}

	@Override
	public int compareTo(Student s) {
		/*System.out.println("this:" + this);
		System.out.println("student:" + s);
		System.out.println("===========================");*/
		int result = this.age - s.age;

		if (result == 0) {
			result = this.id - s.id;

		}

		return result;
	}
}

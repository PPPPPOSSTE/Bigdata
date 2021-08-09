package com.ftrue.day10.demo15;

/**
 * @ClassName Animal
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月09日 16时40分
 * @Version 1.0
 */
public abstract class Animal {
	private String name;
	private int age;

	public Animal() {
	}

	public Animal(String name, int age) {
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

	//因为动物吃的东西不同,需要所有的子类重写eat()
	public abstract void eat ();

	//动物还拥有睡觉的功能,不需要所有的子类进行重写
	public void sleep () {
		System.out.println("睡觉觉");
	}
}

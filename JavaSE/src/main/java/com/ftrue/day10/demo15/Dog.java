package com.ftrue.day10.demo15;

/**
 * @ClassName Dog
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月09日 16时43分
 * @Version 1.0
 */
public class Dog extends Animal {
	@Override
	public void eat() {
		System.out.println(getAge() + "岁的" + getName() + "正在吃shit");
	}

	//狗拥有自己特有的方法:看家
	public void lookHome () {
		System.out.println(getAge() + "岁的" + getName() + "正在看家");
	}

	public Dog() {
	}

	public Dog(String name, int age) {
		super(name, age);
	}
}

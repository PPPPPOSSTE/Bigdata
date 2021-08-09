package com.ftrue.day11.inter.demo04;

/**
 * @ClassName Cat
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月10日 11时14分
 * @Version 1.0
 */
public class Dog extends Animal {
	@Override
	public void eat() {
		System.out.println(getAge() + "岁的" + getName() + "正在吃骨头");
	}

	//狗含有特有的方法
	public void lookHome () {
		System.out.println(getAge() + "岁的" + getName() + "正在看家");
	}

	public Dog() {
	}

	public Dog(String name, int age) {
		super(name, age);
	}
}

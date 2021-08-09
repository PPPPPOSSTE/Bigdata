package com.ftrue.day11.inter.demo04;

/**
 * @ClassName Cat
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月10日 11时14分
 * @Version 1.0
 */
public class Cat extends Animal {
	@Override
	public void eat() {
		System.out.println(getAge() + "岁的" + getName() + "正在吃鱼");
	}

	//猫含有特有的方法
	public void catchMouse () {
		System.out.println(getAge() + "岁的" + getName() + "正在抓老鼠");
	}

	public Cat() {
	}

	public Cat(String name, int age) {
		super(name, age);
	}
}

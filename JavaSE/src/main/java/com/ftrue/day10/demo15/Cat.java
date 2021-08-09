package com.ftrue.day10.demo15;

/**
 * @ClassName Cat
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月09日 16时43分
 * @Version 1.0
 */
public class Cat extends Animal {
	@Override
	public void eat() {
		System.out.println(getAge() + "岁的" + getName() + "正在吃鱼");
	}

	//猫拥有自己特有的方法:抓老鼠
	public void catchMouse () {
		System.out.println(getAge() + "岁的" + getName() + "正在抓老鼠");
	}

	public Cat() {
	}

	public Cat(String name, int age) {
		super(name, age);
	}
}

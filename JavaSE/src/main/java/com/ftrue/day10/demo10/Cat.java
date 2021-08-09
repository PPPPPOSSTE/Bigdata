package com.ftrue.day10.demo10;

/**
 * @ClassName Cat
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月09日 11时50分
 * @Version 1.0
 */
public class Cat extends Animal {
	public Cat() {
	}

	public Cat(String name, int age) {
		super(name, age);
	}

	//重写父类的中的eat()
	@Override
	public void eat () {
		System.out.println(getAge() + "岁的" + getName() + "正在吃鱼");
	}

	//猫还存在自己的特有方法
	public void catchMouse () {
		System.out.println(getAge() + "岁的" + getName() + "正在抓老鼠");
	}
}

package com.ftrue.day11.inter.demo04;

/**
 * @ClassName InterfaceDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月10日 11时09分
 * @Version 1.0
 */
public class InterfaceDemo04 {
	public static void main(String[] args) {
		//创建猫对象
		Cat cat = new Cat("Tom", 2);
		cat.catchMouse();
		cat.eat();
		cat.sleep();

		System.out.println("======================");

		//创建狗对象
		Dog dog = new Dog("TwoHa", 3);
		dog.lookHome();
		dog.eat();
		dog.sleep();
	}
}

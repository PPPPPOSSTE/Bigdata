package com.ftrue.day10.demo10;

/**
 * @ClassName ExtendsDemo10
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月09日 11时46分
 * @Version 1.0
 */
public class ExtendsDemo10 {
	public static void main(String[] args) {
		//创建猫对象
		Cat cat = new Cat("Tom", 2);
		cat.catchMouse();
		cat.eat();
		cat.sleep();

		System.out.println("==============================");

		//创建狗对象
		Dog dog = new Dog ("TwoHa",3);
		dog.lookHome();
		dog.eat();
		dog.sleep();
	}
}

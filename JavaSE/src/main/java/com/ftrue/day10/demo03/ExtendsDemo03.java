package com.ftrue.day10.demo03;

/**
 * @ClassName ExtendsDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月09日 09时48分
 * @Version 1.0
 *
 * 继承的特点2:静态成员
 *      子类可以继承父类的静态成员
 */
public class ExtendsDemo03 {
	public static void main(String[] args) {
		//静态成员属于父类
		System.out.println(SuperClass.num);
		SuperClass.method();

		System.out.println("=======================");

		System.out.println(SubClass.num);
		SubClass.method();
	}
}

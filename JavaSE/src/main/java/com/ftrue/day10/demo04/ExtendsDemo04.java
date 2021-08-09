package com.ftrue.day10.demo04;

/**
 * @ClassName ExtendsDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月09日 10时10分
 * @Version 1.0
 *
 * 继承的特点3:实例变量
 *      子类可以继承父类的实例变量
 */
public class ExtendsDemo04 {
	public static void main(String[] args) {
		//创建子类对象
		SubClass sc = new SubClass();
		System.out.println(sc.num);
	}
}

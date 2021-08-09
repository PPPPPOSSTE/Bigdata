package com.ftrue.day12.inner.demo04;

/**
 * @ClassName InnerDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月12日 10时19分
 * @Version 1.0
 *
 * 匿名内部类:
 *      匿名的类其实就是接口的实现类
 *
 * 学习目的:
 *      1.使用匿名内部类简化接口的使用步骤
 *      2.学习匿名内部类是学习Lambda表达式的前提条件
 *
 * 先回顾接口的使用步骤:
 *      1.创建接口的实现类
 *      2.在实现类中重写接口中的抽象方法
 *      3.在测试类中创建实现类对象,通过对象调用方法完成需求
 *
 *
 * 匿名内部类格式:
 *      接口名 实现类对象名 = new 接口名() {
 *          接口实现类的类体
 *      };
 *
 *
 */
public class InnerDemo04 {
	public static void main(String[] args) {
		//创建实现类对象
		SuperInterface sc = new SubClass(); //多态
		sc.print("HelloWorld");

		System.out.println("==========================");

		//si就是通过匿名内部类的方法创建接口实现类对象
		SuperInterface si = new SuperInterface() {  //多态
			@Override
			public void print(String str) {
				System.out.println(str);
			}
		};

		si.print("HelloWorld");
	}
}

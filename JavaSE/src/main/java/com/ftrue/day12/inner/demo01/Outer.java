package com.ftrue.day12.inner.demo01;

/**
 * @ClassName Outer
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月12日 08时53分
 * @Version 1.0
 */
public class Outer {
	int a = 10; //外部类的实例变量
	private int b = 20;//外部类的私有实例变量
	static int c = 30;//外部类的静态变量
	int num = 10;


	//实例成员内部类
	class Inner {
		int a = 10; //内部类的实例变量
		private int b = 20;//内部类的私有实例变量
		//static int c = 30;//内部类的静态变量
		int num = 20;

		public void method () {
			int num = 30;
			System.out.println("num = " + num);
			System.out.println("num = " + this.num);
			System.out.println("num = " + Outer.this.num);
		}
	}

	public void show () {
		//创建内部类对象
		Inner inner = new Inner();
		System.out.println(inner.a);
		System.out.println(inner.b);
	}

}

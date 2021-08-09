package com.ftrue.day12.inner.demo03;

/**
 * @ClassName Outer
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月12日 09时33分
 * @Version 1.0
 */
public class Outer {
	int a = 10;//外部类的实例变量
	int num = 10;


	public void method () {
		int b = 20;//外部类的局部变量
		int num = 20;

		class Inner {
			int c = 30;//内部类的实例变量
			int num = 30;

			public void show () {
				int d = 40;//内部类的局部变量
				int num = 40;


				System.out.println(d);
				System.out.println(c);
				System.out.println(b);
				System.out.println(a);
				System.out.println("=============================");

				System.out.println(num);
				System.out.println(this.num);
				System.out.println(Outer.this.num);

				System.out.println("=============================");

				d = 44;
				c = 33;
				//b = 22; //变量赋什么数据值,取决于变量名前面的数据类型
				a = 11;

				System.out.println(d);
				System.out.println(c);
				System.out.println(b);
				System.out.println(a);
			}
		}

		//创建内部类对象
		Inner inner = new Inner();
		inner.show();

	}
}

package com.ftrue.day12.inner.demo02;

/**
 * @ClassName Outer
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月12日 09时21分
 * @Version 1.0
 */
public class Outer {
	int a = 10;
	static int b = 20;
	private static int c = 30;

	static class Inner {
		//int a = 10;
		static int b = 20;
		private static int c = 30;

		public static void method () {
			System.out.println(b);
			System.out.println(c);
		}
	}

	public static void show () {
		System.out.println(Inner.b);
		System.out.println(Inner.c);
	}
}

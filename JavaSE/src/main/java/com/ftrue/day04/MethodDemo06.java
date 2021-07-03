package com.ftrue.day04;

/*
	方法的重载:
		在同一个类中(或者子父类继承关系中),出现了方法名相同,形参列表不同的现象

	方法重载的前提条件:
		1.在同一个类中(或者子父类继承关系中)
		2.方法名必须相同
		3.形参列表必须不同(至少满足以下一种)
			a.形参的个数不同
			b.形参的数据类型不同
			c.形参的数据类型顺序不同
*/

public class MethodDemo06 {
	public static void getSum (int a , int b) {}

	//public static void getSum (int b , int a) {}

	public static void getSum (double a , double b) {}

	public static void getSum (int a , int b , int c) {}

	public static void getSum (int a , double b) {}

	public static void getSum (double a , int b) {}
}
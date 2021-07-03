package com.ftrue.day05;

/**
 * @ClassName ArrayDemo11
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月02日 16时34分
 * @Version 1.0
 *
 * 可变参数:
 *      JDK5.0的特性
 *
 * 格式:
 *      修饰符 返回值类型 方法名 (形参类型... 形参名) {}
 *
 * 含义:
 *      可以参数就是一个静态初始化的数组
 *
 * 注意事项:
 *      1.当方法的形参是可变参数时,在调用的时候不传递任何实参,在方法中会初始化长度为0的数组
 *      2.当一个方法除了可变参数外还存在其它参数,需要将可变参数声明在形参列表的最后面
 *      3.一个方法最多只能含有一个可变参数
 */
public class ArrayDemo11 {
	public static void main(String[] args) {
		int[] arr01 = {11,22,33};
		method(arr01);
		System.out.println("===================");
		int[] arr02 = {11,22,33,44,55};
		method(arr02);
		System.out.println("===================");
		//print(11,22,33,44);
		print(12,23,34);
	}

	public static void method (int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void print (int... arr) {
		System.out.println(arr);
	}
}

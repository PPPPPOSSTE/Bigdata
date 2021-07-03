package com.ftrue.day05;

/**
 * @ClassName ArrayDemo06
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月02日 15时14分
 * @Version 1.0
 *
 * 两个数组指向同一内存地址值的内存图解
 */
public class ArrayDemo06 {
	public static void main(String[] args) {
		int[] arr01 = {11,22,33};
		System.out.println(arr01);
		System.out.println(arr01[0]);
		System.out.println(arr01[1]);
		System.out.println(arr01[2]);

		int[] arr02 = arr01;
		System.out.println(arr02);
		System.out.println(arr02[0]);
		System.out.println(arr02[1]);
		System.out.println(arr02[2]);

		arr02[0] = 100;
		arr02[2] = 300;

		System.out.println(arr02);
		System.out.println(arr02[0]);
		System.out.println(arr02[1]);
		System.out.println(arr02[2]);

		System.out.println(arr01);
		System.out.println(arr01[0]);
		System.out.println(arr01[1]);
		System.out.println(arr01[2]);
	}
}

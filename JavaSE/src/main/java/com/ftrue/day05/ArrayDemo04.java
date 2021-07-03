package com.ftrue.day05;

/**
 * @ClassName ArrayDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月02日 14时41分
 * @Version 1.0
 *
 * 数组动态初始化的内存图解
 */
public class ArrayDemo04 {
	public static void main(String[] args) {
		int[] arr = new int[3];

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		System.out.println("=====================");

		arr[0] = 100;
		arr[2] = 300;

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}

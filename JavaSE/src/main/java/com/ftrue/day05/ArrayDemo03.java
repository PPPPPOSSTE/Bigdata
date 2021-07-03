package com.ftrue.day05;

/**
 * @ClassName ArrayDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月02日 14时12分
 * @Version 1.0
 *
 * 动态获取数组的长度
 *      数组名.length
 */
public class ArrayDemo03 {
	public static void main(String[] args) {
		int[] arr = {11,22,33,44};

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		System.out.println("===========================");

		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("===========================");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

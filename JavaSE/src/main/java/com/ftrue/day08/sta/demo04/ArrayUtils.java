package com.ftrue.day08.sta.demo04;

/**
 * @ClassName ArrayUtils
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月06日 14时05分
 * @Version 1.0
 *
 * 数组的工具类
 */
public class ArrayUtils {

	private ArrayUtils () {}

	public static void printArr (int... arr) {
		System.out.print("数组:[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			} else{
				System.out.print(arr[i] + ", ");
			}
		}
	}
}

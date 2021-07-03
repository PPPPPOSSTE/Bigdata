package com.ftrue.day06;

/**
 * @ClassName ArrayDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月03日 09时07分
 * @Version 1.0
 *
 * 数组获取最大值元素
 */
public class ArrayDemo03 {
	public static void main(String[] args) {
		int[] arr = {5,15,2000,10000,100,4000};

		int max = getMax(arr);
		System.out.println("max = " + max);
	}

	/*
		两个明确:
			返回值类型:int
			形参列表:int[] arr
	*/
	public static int getMax (int[] arr) {
		if (arr == null) {
			return 0;
		}

		//声明临时最大值变量
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		return max;
	}
}

package com.ftrue.day06;

/**
 * @ClassName ArrayDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月03日 09时03分
 * @Version 1.0
 *
 *
 * 数组的求和（获取数组中所有元素的累加和）
 */
public class ArrayDemo02 {
	public static void main(String[] args) {
		int[] arr = {11,22,33};
		System.out.println(getSum(arr));
	}

	/*
		两个明确:
			返回值类型:int
			形参列表:int[] arr
	*/
	public static int getSum (int[] arr) {
		if (arr == null) {
			return 0;
		}

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		return sum;
	}
}

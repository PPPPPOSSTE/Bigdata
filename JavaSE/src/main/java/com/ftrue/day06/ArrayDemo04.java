package com.ftrue.day06;

/**
 * @ClassName ArrayDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月03日 09时24分
 * @Version 1.0
 *
 * 分析以下需求，并用代码实现：
 *  （1）在编程竞赛中，有10位评委为参赛的选手打分，分数分别为：5，4，6，8，9，0，1，2，7，3
 *  （2）求选手的最后得分（去掉一个最高分和一个最低分后其余8位评委打分的平均值）
 */
public class ArrayDemo04 {
	public static void main(String[] args) {
		//将10位评委的分数用数组保存起来
		int[] arr = {5,4,6,8,9,0,1,2,7,3};

		//求10位评委总分
		int sum = getSum(arr);
		//求最高分
		int max = getMax(arr);
		//求最低分
		int min = getMin(arr);
		//求最后得分
		double result = getResult(sum,max,min,arr);

		System.out.println("result = " + result);
	}


	/*
		两个明确:
			返回值类型:int
			形参列表: int sum, int max , int min, int[] arr
	*/
	public static double getResult (int sum, int max, int min ,int[] arr) {
		if (arr == null) {
			return 0;
		}

		if (arr.length <= 2) {
			return 0;
		}

		double result = (sum - max - min) * 1.0 / (arr.length - 2);

		return result;
	}


	/*
		两个明确:
			返回值类型:int
			形参列表:int[] arr
	*/
	public static int getMin (int[] arr) {
		if (arr == null) {
			return 0;
		}

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		return min;
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

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		return max;
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

package com.ftrue.day06;

import java.util.Arrays;

/**
 * @ClassName ArrayDemo06
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月03日 10时37分
 * @Version 1.0
 *
 * 数组的排序:
 *      根据某种规则针对数组中的元素进行排序
 *
 * 数组排序的分类:
 *      冒泡,选择,插入,归并,快排,桶.....
 *
 * 冒泡排序:
 *      原理:比较两个相邻的元素，将值大的元素交换至右端。
 */
public class ArrayDemo06 {
	public static void main(String[] args) {
		int[] arr = {5,4,6,8,9,0,1,2,7,3};
		System.out.println("排序前:" + printArr(arr));
		sort03(arr);
		System.out.println("排序后:" + printArr(arr));

	}

	public static void sort03 (int[] arr) {
		if (arr == null) {
			return;
		}

		//外层循环count:比较的轮数(求几次最大值)
		for (int count = 1 ; count < arr.length ; count++) {
			//内层循环i:比较的次数(求一次最大值比较的次数)
			for (int i = 0; i < arr.length - count; i++) {
				if (arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i+1] = temp;
				}
			}
		}

	}

	public static void sort02 (int[] arr) {
		if (arr == null) {
			return;
		}

		/*
			第一轮比较
		*/
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i+1] = temp;
			}
		}

		/*
			第二轮比较
		*/
		for (int i = 0; i < arr.length - 2; i++) {
			if (arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i+1] = temp;
			}
		}


		/*
			第三轮比较
		*/
		for (int i = 0; i < arr.length - 3; i++) {
			if (arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i+1] = temp;
			}
		}
	}


	public static void sort01 (int[] arr) {
		if (arr == null) {
			return;
		}

		/*
			第一轮第一次比较
				排序前:[4,3,2,1]
				排序后:[3,4,2,1]
		*/
		if (arr[0] > arr[1]) {
			int temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
		}

		/*
			第一轮第二次比较
				排序前:[3,4,2,1]
				排序后:[3,2,4,1]
		*/
		if (arr[1] > arr[2]) {
			int temp = arr[1];
			arr[1] = arr[2];
			arr[2] = temp;
		}

		/*
			第一轮第三次比较
				排序前:[3,2,4,1]
				排序后:[3,2,1,4]
		*/
		if (arr[2] > arr[3]) {
			int temp = arr[2];
			arr[2] = arr[3];
			arr[3] = temp;
		}

		/*
			第二轮第一次比较
				排序前:[3,2,1,4]
				排序后:[2,3,1,4]
		*/
		if (arr[0] > arr[1]) {
			int temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
		}

		/*
			第二轮第二次比较
				排序前:[2,3,1,4]
				排序后:[2,1,3,4]
		*/
		if (arr[1] > arr[2]) {
			int temp = arr[1];
			arr[1] = arr[2];
			arr[2] = temp;
		}

		/*
			第三轮第一次比较
				排序前:[2,1,3,4]
				排序后:[1,2,3,4]
		*/
		if (arr[0] > arr[1]) {
			int temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
		}
	}

	public static String printArr (int[] arr) {
		//针对数组做非空校验
		if (arr == null) {
			return "[]";
		}

		if (arr.length == 0) {
			return "[]";
		}

		String str = "[";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				str += arr[i] + "]";
			} else {
				str += arr[i] + ", ";
			}
		}

		return str;
	}
}

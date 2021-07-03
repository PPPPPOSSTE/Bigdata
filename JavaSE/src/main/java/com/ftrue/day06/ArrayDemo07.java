package com.ftrue.day06;

/**
 * @ClassName ArrayDemo07
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月03日 11时27分
 * @Version 1.0
 *
 * 查找指定元素在数组中出现的第一次索引
 *      1.针对数组从索引0位置上依次遍历
 *      2.二分法查找
 *
 *
 * 二分法查找(折半查找法):
 *      针对待查找的数据范围不断进行折半压缩
 *
 *      前提条件:
 *          1.数组中的元素需要是有序的
 *          2.数组的长度不能太短
 *
 */
public class ArrayDemo07 {
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55};
		int index = getIndex02(arr,54);
		if (index == -1) {
			System.out.println("待查找元素在数组中不存在或者数组为空");
		} else {
			System.out.println("待查找元素在数组中的索引位置是:" + index);
		}
	}


	public static int getIndex02 (int[] arr , int num) {
		//针对数组做非空校验
		if (arr == null) {
			return -1;
		}

		//针对数组进行排序,排序步骤省略,将待传入数组保证有序即可

		//声明二分查找所需的变量
		int start = 0; //待查找范围起始索引
		int end = arr.length - 1; //待查找范围终止索引
		int mid = (start + end) / 2; // 待判断索引位置

		//因为无法确认循环的次数,选择while循环
		while (start <= end) {
			if (num > arr[mid]) {
				//修改下一次待查找的索引范围
				start = mid + 1;
			} else if (num < arr[mid]) {
				//修改下一次待查找的索引范围
				end = mid - 1;
			} else {
				return mid;
			}

			//修改下一次待查找的索引位置
			mid = (start + end) / 2;
		}


		return -1;
	}

	/*
		两个明确:
			返回值类型:int
			形参列表:int[] arr,int num
	*/
	public static int getIndex01 (int[] arr , int num) {
		//针对数组做非空校验
		if (arr == null) {
			return -1;
		}

		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				return i;
			}
		}

		return -1;
	}
}

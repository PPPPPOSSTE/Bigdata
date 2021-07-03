package com.ftrue.day06;

/**
 * @ClassName ArrayDemo05
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月03日 10时02分
 * @Version 1.0
 *
 * 数组的反转:
 *      针对数组首尾两端元素依次调换位置
 *
 * 1.确认待交换的索引位置变量
 *      int start = 0;
 *      int end = arr.length - 1
 *
 * 2.待交换索引位置变量移动规律
 *      start++,end--
 *
 * 3.如果交换元素
 *      例如: int a = 3, b = 4;
 *      int temp = a;
 *      a = b;
 *      b = temp;
 *
 *      如果是数组
 *      int temp = arr[start];
 *      arr[start] = arr[arr.length - 1]
 *      arr[arr.length - 1] = temp;
 *
 * 4.什么条件进行元素的交换?
 *      当数组的长度是奇数个时,start < end
 *      当数组的长度是偶数个时,start < end
 *
 * 5.start和end之间的关系
 *      start + end = arr.length - 1
 *             end = arr.length - 1 - start
 *
 * 6.优化 i < arr.length - 1 - i
 *      i + i < arr.length - 1
 *          i < (arr.length - 1)/2
 *          i < arr.length/2 - 1/2
 *          i < arr.length/2
 *
 */
public class ArrayDemo05 {
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55};
		System.out.println("反转前:" + printArr(arr));
		reverse(arr);
		System.out.println("反转后:" + printArr(arr));
	}

	/*
		两个明确:
			返回值类型:void
			形参列表:int[] arr
	*/
	public static void reverse (int[] arr) {
		//针对数组做非空校验
		if (arr == null) {
			return;
		}

		for (int i = 0; i < arr.length/2 ; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}

		/*for (int i = 0; i < arr.length - 1 - i ; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}*/

		/*for (int start = 0, end = arr.length - 1;start < end; start++,end--) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}*/

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

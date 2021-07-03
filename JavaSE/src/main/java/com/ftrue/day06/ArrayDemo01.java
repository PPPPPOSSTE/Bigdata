package com.ftrue.day06;

/**
 * @ClassName ArrayDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月03日 08时50分
 * @Version 1.0
 *
 * 数组的应用:
 *      1.针对数组中的数据做相应的操作
 *      2.不依赖第二个数组,针对数组中的数据进行位置上的调整
 *      3.数组中动态扩容,删除,插入
 *
 * 按照固定格式进行数组的打印
 *      数组:[11, 22, 33]
 */
public class ArrayDemo01 {
	public static void main(String[] args) {
		int[] arr = {};
		System.out.println(print(arr));
	}

	/*
		两个明确:
			返回值类型: String
			形参列表: int[] arr
	*/
	public static String print (int[] arr) {

		if (arr == null) {
			return "数组:[]";
		}

		if (arr.length == 0) {
			return "数组:[]";
		}

		String str = "数组:[";

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

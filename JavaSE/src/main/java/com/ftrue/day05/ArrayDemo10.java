package com.ftrue.day05;

/**
 * @ClassName ArrayDemo10
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月02日 16时22分
 * @Version 1.0
 *
 * 方法的健壮性判断
 *
 */
public class ArrayDemo10 {
	public static void main(String[] args) {
		int[] arr = {11,22,33};
		int index = 1;

		//调用方法,获取指定索引位置上的元素
		method(null,10);
	}

	//功能:获取指定索引位置上元素
	public static void method (int[] arr , int index) {

		//针对引用数据类型参数做非空校验
		if (arr == null) {
			System.out.println("数组为空,无法获取元素");
			return;
		}

		//针对数组的索引做合法性校验
		if (index < 0 || index >= arr.length) {
			System.out.println("索引错误");
			return;
		}



		System.out.println(arr[index]);
	}
}

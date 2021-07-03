package com.ftrue.day05;

/**
 * @ClassName ArrayDemo08
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月02日 15时31分
 * @Version 1.0
 *
 * ArrayIndexOutOfBoundsException:数组索引越界异常
 *      产生原因:出现了非法或者不存在的索引
 *
 * NullPointerException:空指针异常
 *      产生原因:引用数据类型的变量值为null,通过变量名进行元素的获取或者方法的调用
 */
public class ArrayDemo08 {
	public static void main(String[] args) {
		int[] arr = {11,22,33};

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		//System.out.println(arr[3]);
		System.out.println("=========================");

		arr = null;
		System.out.println(arr);
		System.out.println(arr[0]);
	}
}

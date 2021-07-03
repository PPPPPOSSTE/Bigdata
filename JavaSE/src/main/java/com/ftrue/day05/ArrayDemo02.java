package com.ftrue.day05;

/**
 * @ClassName ArrayDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月02日 14时03分
 * @Version 1.0
 *
 * 数组的动态访问:
 *      访问数组中的元素
 *      访问数组的长度
 *
 * [I@1b6d3586被称之为"人工模拟的内存地址值"
 *      数据类型 + "@" + 16进制的(哈希码)值
 *
 * 访问数组中的元素
 *      索引值:Java开发人员针对数组中的元素进行的编号
 *      特点:从0开始,最大的索引值就是数组的长度-1
 *      格式:
 *          数组名[索引值]
 *
 */
public class ArrayDemo02 {
	public static void main(String[] args) {
		int[] arr = {11,22,33};

		System.out.println(arr);//[I@1b6d3586
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		System.out.println("=========================");

		arr[0] = 100;
		arr[2] = 200;

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}

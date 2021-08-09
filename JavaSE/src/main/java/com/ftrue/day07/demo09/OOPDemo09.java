package com.ftrue.day07.demo09;

/**
 * @ClassName OOPDemo09
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月05日 15时41分
 * @Version 1.0
 *
 * 对象数组:
 *      存储元素是对象的数组
 *
 */
public class OOPDemo09 {
	public static void main(String[] args) {
		//基本数据类型数组
		int[] arr01 = {11,22,33};

		//特殊的对象数组
		String[] arr02 = {"a","b","c"};

		//学生数组,存储学生对象
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();

		//创建学生数组
		Student[] arr03 = {s1,s2,s3};

		for (int i = 0; i < arr03.length; i++) {
			System.out.println(arr03[i]);
		}
	}
}

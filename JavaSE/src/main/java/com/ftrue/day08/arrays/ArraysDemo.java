package com.ftrue.day08.arrays;

import java.util.Arrays;

/**
 * @ClassName ArraysDemo
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月06日 17时35分
 * @Version 1.0
 *
 * Arrays类
 *      类的特点
 *          数组工具类
 *      类的位置
 *          java.util
 *      类的构造器
 *          构造器私有化
 *      类的方法
 *          public static String toString(int[] a)
 *              返回指定数组内容的字符串表示形式。
 *          public static int[] copyOf(int[] original,int newLength)
 *              复制指定的数组，截取或用 0 填充（如有必要），以使副本具有指定的长度。
 *          public static void sort(int[] a)
 *              对指定的 int 型数组按数字升序进行排序。
 *
 *
 * Arrays类的sort()的排序规则
 *      基本数据类型的数组:
 *          按照数值从小到大
 *      字符串类型数组:
 *          按照Unicode码表从小到大
 *      自定义类型数组:
 *          自定义比较器:(暂时放放,到集合的时候讲解)
 *              自然顺序:
 *                  实现Comparable<T>接口
 *              定制顺序
 *                  实现Comparator<T>接口
 *
 */
public class ArraysDemo {
	public static void main(String[] args) {
		//分别创建int类型数组,String类型数组,自定义类型数组
		int[] arr01 = {44,22,33,11,55};
		String[] arr02 = {"bca","abc","cba","acb","cab","bac"};

		Student s1 = new Student("张小芳", 18);
		Student s2 = new Student("张小弛", 18);
		Student s3 = new Student("安小妮", 18);
		Student s4 = new Student("李小朦", 18);
		Student s5 = new Student("崔小荣", 18);

		Student[] arr03 = {s1,s2,s3,s4,s5};

		//按照固定格式打印数组中的内容
		System.out.println(Arrays.toString(arr01));
		System.out.println(Arrays.toString(arr02));
		System.out.println(Arrays.toString(arr03));

		System.out.println("=======================================");

		//自定义长度进行数组的复制
		int[] newArr01 = Arrays.copyOf(arr01,10);
		System.out.println(Arrays.toString(newArr01));
		String[] newArr02 = Arrays.copyOf(arr02,10);
		System.out.println(Arrays.toString(newArr02));

		System.out.println("=======================================");

		//按照指定的规则进行排序
		System.out.println("排序前:" + Arrays.toString(arr01));
		Arrays.sort(arr01);
		System.out.println("排序后:" + Arrays.toString(arr01));

		System.out.println("排序前:" + Arrays.toString(arr02));
		Arrays.sort(arr02);
		System.out.println("排序后:" + Arrays.toString(arr02));

		System.out.println("排序前:" + Arrays.toString(arr03));
		Arrays.sort(arr03);
		System.out.println("排序后:" + Arrays.toString(arr03));
	}
}

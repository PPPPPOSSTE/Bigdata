package com.ftrue.day17.utils;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName CollectionsDemo
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月19日 08时48分
 * @Version 1.0
 *
 * Collections类
 *      类的特点
 *          针对Collection集合进行操作的工具类
 *      类的位置
 *          java.util
 *      类的构造器
 *          构造器私有化
 *      类的方法
 *          public static <T> boolean addAll(Collection<? super T> c,T... elements)
 *              将所有指定元素添加到指定 collection 中。
 *          public static void reverse(List<?> list)
 *              反转指定列表中元素的顺序。
 *          public static void shuffle(List<?> list)
 *              使用默认随机源对指定列表进行置换。所有置换发生的可能性都是大致相等的。
 *
 */
public class CollectionsDemo {
	public static void main(String[] args) {
		//创建集合对象
		ArrayList<String> list = new ArrayList<>();

		//聚合添加元素
		Collections.addAll(list,"a","b","c");

		System.out.println(list);

		System.out.println("========================================");

		//针对集合中的元素进行反转操作
		Collections.reverse(list);

		System.out.println(list);

		System.out.println("========================================");

		//针对集合中的元素进行位置上重新存储
		Collections.shuffle(list);

		System.out.println(list);
	}
}

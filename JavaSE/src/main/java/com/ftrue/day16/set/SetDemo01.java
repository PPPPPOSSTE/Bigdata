package com.ftrue.day16.set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @ClassName SetDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月17日 11时46分
 * @Version 1.0
 *
 * Set接口
 *      接口的特点
 *          1.Set集合不可以存储重复元素
 *          2.Set集合是没有索引的集合
 *          3.Set集合没有特有迭代器
 *          4.Set集合的遍历方式:
 *              迭代器和增强for
 *      接口的位置
 *          java.util
 *      接口的方法
 *          都已经在Collection时候都学习过了
 *
 */
public class SetDemo01 {
	public static void main(String[] args) {
		//使用多态的形式创建Set集合对象
		Set<String> set = new LinkedHashSet<>();

		//添加元素
		set.add("abc");
		set.add("cba");
		set.add(new String("abc"));
		set.add(new String("abc"));

		System.out.println(set);
	}
}

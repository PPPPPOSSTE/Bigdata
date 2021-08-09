package com.ftrue.day16.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

/**
 * @ClassName ListDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月17日 08时43分
 * @Version 1.0
 *
 * List集合的遍历方式
 *      1.迭代器
 *      2.增强for
 *      3.特有迭代器
 *      4.普通for
 *      5.Stream流(以后讲解,也是Collection集合通用遍历方式)
 */
public class ListDemo01 {
	public static void main(String[] args) {
		//使用多态的形式创建对象
		List<String> list = new ArrayList<>();

		//添加元素
		list.add("迪丽热巴");
		list.add("古力娜扎");
		list.add("玛尔扎哈");
		list.add("摩托罗拉");

		//针对List集合使用迭代器进行遍历
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("===========================");

		//针对List集合使用增强for进行遍历
		for (String str : list) {
			System.out.println(str);
		}

		System.out.println("===========================");

		//针对List集合使用特有迭代器进行遍历
		ListIterator<String> lit = list.listIterator();
		while (lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println("===========================");

		//针对List集合使用特有迭代器进行遍历
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("===========================");

		Stream<String> stream = list.stream();

		stream.forEach(System.out::println);
	}
}

package com.ftrue.day15.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName CollectionDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月16日 11时35分
 * @Version 1.0
 *
 * 迭代器的注意事项:
 *      1.当迭代器中后续没有元素的时候,不能继续执行next(),否则会发生NoSuchElementException
 *      2.使用迭代器遍历集合中的元素时,在遍历的过程中不能针对集合的元素的个数有任何操作,否则会发生ConcurrentModificationException
 */
public class CollectionDemo03 {
	public static void main(String[] args) {
		//使用多态的形式创建集合对象
		Collection coll = new ArrayList();

		//添加元素
		coll.add("abc");
		coll.add("def");
		coll.add("ghi");


		//获取迭代器对象,迭代器要遍历的元素有3个
		Iterator it = coll.iterator();

		coll.add(123);

		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}

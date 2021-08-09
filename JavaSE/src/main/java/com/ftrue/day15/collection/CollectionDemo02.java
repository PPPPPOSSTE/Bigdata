package com.ftrue.day15.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName CollectionDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月16日 11时18分
 * @Version 1.0
 *
 * 单列集合的通用遍历方式1:迭代器
 *      迭代器思路:将集合中所有的元素存储在迭代器中,直接遍历迭代器对象即可
 *
 * Iterator接口
 *      接口的特点
 *          对 collection 进行遍历的迭代器。
 *      接口的位置
 *          java.util
 *      接口的方法
 *          boolean hasNext()
 *              如果仍有元素可以迭代，则返回 true
 *          E next()
 *              返回迭代的下一个元素。
 *          void remove()
 *              从迭代器指向的 collection 中移除迭代器返回的最后一个元素（可选操作）。
 *
 *
 * 使用迭代器遍历集合的步骤:
 *      1.通过集合对象获取迭代器对象
 *      2.因为不清楚迭代器到底遍历多少个元素,选择while循环
 *          循环条件语句:迭代器对象.hasNext()
 *      3.开启迭代每一个元素
 *
 *
 * 迭代器的特点:
 *      迭代器只能使用唯一的一次,如果想进行二次使用,需要重新获取迭代器对象
 *
 *
 *
 */
public class CollectionDemo02 {
	public static void main(String[] args) {
		//使用多态的形式创建集合对象
		Collection coll = new ArrayList();

		//添加元素
		coll.add("abc");
		coll.add("def");
		coll.add("ghi");

		//1.通过集合对象获取迭代器对象
		Iterator it = coll.iterator();

		//2.因为不清楚迭代器到底遍历多少个元素,选择while循环
		while (it.hasNext()) {
			//3.开启迭代每一个元素
			Object obj = it.next();
			System.out.println(obj);
		}

		while (it.hasNext()) {
			//3.开启迭代每一个元素
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}

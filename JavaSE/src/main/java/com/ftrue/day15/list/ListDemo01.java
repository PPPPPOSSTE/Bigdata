package com.ftrue.day15.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ListDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月16日 16时03分
 * @Version 1.0
 *
 * List集合接口
 *      接口的特点
 *          1.List集合是有序的集合
 *              有序:存储的顺序是获取的顺序一致
 *              无序:存储的顺序是获取的顺序不一致
 *          2.List集合是含有索引的集合
 *          3.List集合可以存储重复元素
 *          4.List集合可以存储null元素
 *              获取的时候考虑空指针异常,做非空校验
 *          5.List集合中的索引和数组中的索引表达方式不一样
 *              共同点,都是针对容器中的元素进行编号,编号从0开始,到容器长度-1
 *              不同点,List集合里面含有四大数据结构,每一种的索引形成的方式不一样
 *                  数组数据结构(重点)
 *                  链表数据结构(重点)
 *                  栈数据结构
 *                  队列数据结构
 *          6.List集合含有特有的迭代器ListIterator
 *      接口的位置
 *          java.util
 *      接口的方法
 *          void add(int index,E element)
 *              在列表的指定位置插入指定元素（可选操作）。
 *          E get(int index)
 *              返回列表中指定位置的元素。
 *          int indexOf(Object o)
 *              返回此列表中第一次出现的指定元素的索引；如果此列表不包含该元素，则返回 -1。
 *          int lastIndexOf(Object o)
 *              返回此列表中最后出现的指定元素的索引；如果列表不包含此元素，则返回 -1。
 *          ListIterator<E> listIterator()
 *              返回此列表元素的列表迭代器（按适当顺序）。
 *          E remove(int index)
 *              移除列表中指定位置的元素（可选操作）。
 *          E set(int index,E element)
 *              用指定元素替换列表中指定位置的元素（可选操作）。
 *          List<E> subList(int fromIndex,int toIndex)
 *              返回列表中指定的 fromIndex（包括 ）和 toIndex（不包括）之间的部分视图。（
 *
 */
public class ListDemo01 {
	public static void main(String[] args) {
		//使用多态的形式创建集合对象
		List<Integer> list = new ArrayList<>();

		//添加数据
		list.add(55);
		list.add(11);
		list.add(33);
		//list.add(null);
		list.add(44);
		list.add(22);

		System.out.println(list);

		/*for (Integer num : list) {
			int i = num.intValue();
			System.out.println(i);
		}*/

		//在指定的索引位置上添加指定元素
		list.add(3,666);
		System.out.println(list);

		//获取指定索引位置上的元素
		System.out.println(list.get(3));

		//获取指定元素在集合中第一次出现的索引
		list.add(666);
		System.out.println(list);
		System.out.println(list.indexOf(666));

		//获取指定元素在集合中最后一次出现的索引
		System.out.println(list.lastIndexOf(666));

		//根据指定的索引位置删除元素
		//list.remove(3);//删除之后:[55, 11, 33, 44, 22, 666]
		//list.remove(5);
		list.remove(6);//[55, 11, 33, 666, 44, 22]
		//list.remove(3);
		System.out.println(list);

		//将集合中指定索引位置的元素替换成新元素
		list.set(3,66);
		System.out.println(list);

		//根据指定的索引范围截取一段数据,存储到新集合中
		List<Integer> newList = list.subList(2, 4);
		System.out.println(newList);
	}
}

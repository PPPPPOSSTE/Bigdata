package com.ftrue.day16.list;

import java.util.Vector;

/**
 * @ClassName ListDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月17日 10时27分
 * @Version 1.0
 *
 * Vector类
 *      类的特点
 *          1.Vector集合底层数据结构是"数组"
 *          2.Vector集合是线程安全,执行效率低,适用于多线程程序
 *          3.数组数据结构的特点(对比LinkedList中的链表结构)
 *              查询效率高,增删效率低
 *          4.Vector类底层数组结构的初始容量是多少?
 *              初始容量是多少取决于所选择的构造器
 *              a.public Vector(Collection<? extends E> c)
 *                  初始容量:参数集合的长度
 *              b.public Vector(int initialCapacity)
 *                  初始容量:自定义
 *              c.public Vector(int initialCapacity,int capacityIncrement)
 *                  初始容量:自定义
 *                  增量:自定义
 *              d.public Vector()
 *                  初始容量:10
 *                  增量:0
 *          5.扩容规则
 *              原来数组长度 + (增量 > 0) ? 增量 : 原来数组长度
 *      类的位置
 *          java.util
 *      类的构造器
 *          public Vector()
 *              构造一个初始容量为 10 的空列表。
 *      类的方法
 *          在父接口的时候已经讲解,没有新方法了
 */
public class ListDemo04 {
	public static void main(String[] args) {
		//创建Vector对象
		Vector<String> list = new Vector<>();

		//添加元素
		for (int i = 1; i <= 10; i++) {
			list.add("元素" + i);
		}

		//添加元素
		list.add("元素11");
	}
}

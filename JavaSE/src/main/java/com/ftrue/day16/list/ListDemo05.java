package com.ftrue.day16.list;

import java.util.LinkedList;

/**
 * @ClassName ListDemo05
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月17日 10时58分
 * @Version 1.0
 *
 * LinkedList类
 *      类的特点
 *          1.LinkedList底层数据结构是"链接列表",简称:链表
 *          2.根据链表存储内容进行分类
 *              单向链表:当前元素(泛型),下一个Node对象
 *              双向链表:当前元素(泛型),下一个Node对象,上一个Node对象
 *          3.链表在底层其实就是一个类,类型是LinkedList$Node
 *              LinkedList里面的内部类Node是一个双向链表
 *          4.链表结构的特点(相比集合中数组结构)
 *              增删效率高,查询效率低
 *          5.链表结构的弊端:
 *              链表结构长度越长,整体效率越低,后期会通过另外一种数据结构进行替换,
 *              新的数据结构和LinkedList无关,后面学的集合中底层也有链表,
 *              但是当达到某一标准,会将"链表结构"转换成新的数据结构,
 *              而这个新的数据结构叫做"红黑树"
 *          6.LinkedList集合不是线程安全,执行效率高,适用于单线程程序
 *
 *
 *
 *      类的位置
 *          java.util
 *      类的构造器
 *          public LinkedList()
 *              构造一个空列表
 *      类的方法
 *          public void addFirst(E e)将指定元素插入此列表的开头
 *          public void addLast(E e)将指定元素添加到此列表的结尾。
 *          public E getFirst()返回此列表的第一个元素。
 *          public E getLast()返回此列表的最后一个元素
 *          public E removeFirst()移除并返回此列表的第一个元素。
 *          public E removeLast()移除并返回此列表的最后一个元素。
 *
 *
 * 注意事项:
 *      如果需要的集合对象后期处理查询偏多,推荐使用ArrayList
 *      如果需要的集合对象后期处理增删偏多,推荐使用LinkedList
 */
public class ListDemo05 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		//list.add("e");


		System.out.println(list.get(3));
	}
}

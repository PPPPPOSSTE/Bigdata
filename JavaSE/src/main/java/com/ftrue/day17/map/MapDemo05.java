package com.ftrue.day17.map;

import java.util.LinkedHashMap;

/**
 * @ClassName MapDemo05
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月19日 14时11分
 * @Version 1.0
 *
 * LinkedHashMap类
 *      类的特点
 *          1.LinkedHashMap底层数据结构是哈希表+链表
 *              链表作用:维护元素的有序性
 *          2.LinkedHashMap是有序的集合
 *          3.LinkedHashMap可以存储null键和null值,使用时需要注意空指针异常
 *          4.LinkedHashMap不是线程安全的,执行效率高,适用于单线程程序
 *      类的位置
 *          java.util
 *      类的构造器
 *          public LinkedHashMap()
 *              构造一个带默认初始容量 (16) 和加载因子 (0.75) 的空插入顺序 LinkedHashMap 实例。
 *      类的方法
 */
public class MapDemo05 {
	public static void main(String[] args) {
		//创建集合对象
		LinkedHashMap<String, String> map = new LinkedHashMap<>();

		map.put(null,null);

		System.out.println(map);
	}
}

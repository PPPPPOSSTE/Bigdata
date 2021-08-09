package com.ftrue.day17.map;

import java.util.Hashtable;

/**
 * @ClassName MapDemo07
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月19日 14时22分
 * @Version 1.0
 *
 * Hashtable类
 *      类的特点
 *          1.Hashtable集合底层数据结构是哈希表
 *          2.Hashtable集合不可以存储null键和null值
 *          3.Hashtable集合是线程安全的,执行效率低,适用于多线程程序
 *      类的位置
 *          java.util
 *      类的构造器
 *          public Hashtable()
 *              用默认的初始容量 (11) 和加载因子 (0.75) 构造一个新的空哈希表。
 *      类的方法
 *
 *
 * HashMap类和Hashtable类区别
 *      1.null键和null值区别
 *          HashMap:可以存储
 *          Hashtable:不可以存储
 *      2.线程安全性区别:
 *          HashMap:线程不安全
 *          Hashtable:线程安全
 *      3.底层数组初始容量:
 *          HashMap:
 *               JDK7.0(包含)以前:16
 *               JDK8.0(包含)以后:null,当第一次添加元素的时候,初始长度为16
 *          Hashtable:11
 *      4.扩容规则不同:
 *          HashMap:
 *              JDK7.0(包含)以前:
 *                  2 * 原来数组长度
 *              JDK8.0(包含)以后:
 *                  原来数组长度 << 1
 *         Hashtable:
 *              (原来数组长度 << 1) + 1
 */
public class MapDemo07 {
	public static void main(String[] args) {
		//创建集合对象
		Hashtable<String, String> map = new Hashtable<>();

		//map.put(null,"abc");
		map.put("abc",null);
	}
}

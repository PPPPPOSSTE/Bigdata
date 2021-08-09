package com.ftrue.day17.map;

import java.util.TreeMap;

/**
 * @ClassName MapDemo06
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月19日 14时16分
 * @Version 1.0
 *
 * TreeMap类
 *      类的特点
 *          1.TreeMap集合底层数据结构是红黑树
 *              当TreeMap集合存储自定义类型时需要给其指定比较器
 *          2.TreeMap集合不可以存储null键,可以存储null值,在使用的时候需要注意空指针异常
 *          3.TreeMap集合不是线程安全的,执行效率高,适用于单线程程序
 *      类的位置
 *          java.util
 *      类的构造器
 *          public TreeMap()
 *              使用键的自然顺序构造一个新的、空的树映射。
 *          public TreeMap(Comparator<? super K> comparator)
 *              构造一个新的、空的树映射，该映射根据给定比较器进行排序。
 *      类的方法
 *
 */
public class MapDemo06 {
	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<>();

		//map.put(null,"abc");
		map.put("abc",null);

		System.out.println(map);
	}
}

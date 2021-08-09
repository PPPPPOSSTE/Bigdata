package com.ftrue.day16.set;

import java.util.TreeSet;

/**
 * @ClassName SetDemo06
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月17日 16时01分
 * @Version 1.0
 *
 * TreeSet类
 *      类的特点
 *          1.TreeSet类底层数据结构是"红黑树"
 *          2.TreeSet类存储自定义类型的时候,必须给其实现比较器对象
 *              自然顺序Comparable<T>
 *              定制顺序Comparator
 *          3.TreeSet类不是线程安全的,线程执行效率高,适合单线程程序
 *          4.TreeSet类不可以存储null元素,存储之后直接发生空指针异常
 *      类的位置
 *          java.util
 *      类的构造器
 *          public TreeSet()
 *              构造一个新的空 set，该 set 根据其元素的自然顺序进行排序
 *      类的方法
 */
public class SetDemo06 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();

		//set.add(null);
	}
}

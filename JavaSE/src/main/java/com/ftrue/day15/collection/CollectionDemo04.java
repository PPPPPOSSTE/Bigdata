package com.ftrue.day15.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName CollectionDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月16日 11时44分
 * @Version 1.0
 *
 * 因为迭代器中可能发生并发修改异常,在JDK5.0的版本针对迭代器对象的使用步骤进行简化,新增了增强for
 *
 * Collection集合通用的遍历方式2:增强for
 *      格式1:
 *          for (集合中元素的数据类型 对象名 : 集合名) {
 *              循环体语句
 *          }
 *
 *      注意:在增强for循环体语句中不能针对集合中元素的个数做任何修改,否则也会发生ConcurrentModificationException
 *
 *      格式2:
 *          增强for除了可以遍历集合,也可以遍历数组,在实际开发中,不推荐使用迭代器遍历数组
 *          for (数组中元素的数据类型 对象名 : 数组名) {
 *              循环体语句
 *          }
 *
 *      注意:
 *          当增强for遍历数组时,在JVM的底层将这个数组先转换成集合对象,在使用迭代器进行遍历,
 *          但是如果是基本数据类型数组,在过程中还要多一步,
 *          集合中无法存储基本数据类型,需要将基本数据类型自动装箱为包装类型
 *
 */
public class CollectionDemo04 {
	public static void main(String[] args) {
		//使用多态的形式创建集合对象
		Collection coll = new ArrayList();

		//添加元素
		coll.add("abc");
		coll.add("def");
		coll.add("ghi");


		//使用增强for进行遍历
		for (Object obj : coll) {
			//coll.add(123);
			System.out.println(obj);
		}

		System.out.println("====================================");

		int[] arr = {11,22,33};

		for (int num : arr) {
			System.out.println(num);
		}
	}
}

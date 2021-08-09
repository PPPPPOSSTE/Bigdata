package com.ftrue.day16.set;

import java.util.HashSet;

/**
 * @ClassName SetDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月17日 14时18分
 * @Version 1.0
 *
 * HashSet类如何保证元素的唯一性?
 *      1.HashSet集合存储元素对象的时候和元素对象的内存地址值无关
 *      2.重写Object类的hashCode()
 *          在String类中的hashCode()中,为什么始终乘以31,而不是其他数字?
 *              a.这个数值不能太大,也不能太小
 *              b.这个数字必须是质数,减少哈希码重复概率
 *              通过测试人员进行数据测试,最终筛选出两个数值29和31
 *              c.29可以改写为2^5-3,31可以改写成2^5-1,考虑到31改写形式和整数取值范围的写法相似,最终选择31
 *      3.重写Object类的equals()
 */
public class SetDemo03 {
	public static void main(String[] args) {
		//创建HashSet集合对象
		HashSet<String> set = new HashSet<>();

		String s1 = new String("abc");
		String s2 = new String("abc");

		set.add(s1);
		set.add(s2);

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		System.out.println("====================================");

		System.out.println("通话".hashCode());
		System.out.println("重地".hashCode());

		set.add("通话");
		set.add("重地");

		System.out.println(set);
	}
}

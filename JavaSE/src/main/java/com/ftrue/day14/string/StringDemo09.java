package com.ftrue.day14.string;

/**
 * @ClassName StringDemo09
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月14日 15时44分
 * @Version 1.0
 *
 * String笔试题3
 *      统计内存中对象相应的个数
 */
public class StringDemo09 {
	public static void main(String[] args) {
		//统计变量s1声明初始化的过程中共含有1个对象,存在于常量池
		String s1 = "abc";
		//统计变量s2声明初始化的过程中共含有2个对象,存在于常量池和堆
		String s2 = new String("abc");
		//统计变量s3声明初始化的过程中共含有1个对象,存在于常量池
		String s3 = "a" + "b" + "c";
		//统计变量s3声明初始化的过程中共含有5个对象,3个存在于常量池,2个存在于堆
		String str1 = "a";
		String str2 = "b";
		String str3 = "c";
		String s4 = str1 + str2 + str3;
	}
}

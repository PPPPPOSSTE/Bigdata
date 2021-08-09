package com.ftrue.day14.string;

/**
 * @ClassName StringDemo07
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月14日 15时04分
 * @Version 1.0
 *
 * String的笔试题1
 */
public class StringDemo07 {
	public static void main(String[] args) {
		String s1 = new String("HelloWorld");
		String s2 = new String("HelloWorld");
		System.out.println(s1 == s2);//false s1和s2都在堆
		System.out.println("======================================");

		String s3 = "HelloWorld";//常量池
		String s4 = "HelloWorld";//常量池
		System.out.println(s3 == s4);//true
		System.out.println("======================================");

		String s5 = new String("Hello");
		String s6 = new String("World");
		System.out.println(s5 + s6 == s1);//false 堆
		System.out.println("======================================");

		String s7 = "Hello";
		String s8 = "World";
		System.out.println(s3 == s7 + s8);//false,s3常量池,s7常量池,s8常量池,s7+s8相当于在堆new
		System.out.println("======================================");

		System.out.println(s3 == "Hello" + "World");//true
		//"Hello" + "World" 因为+两边都是字符串字面值常量,在编译时直接将其进行合并,将合并后的"HelloWorld"存储到常量池
	}
}

package com.ftrue.day14.string;

/**
 * @ClassName StringDemo08
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月14日 15时29分
 * @Version 1.0
 *
 * String笔试题2:
 *      在程序中如果自定义常量(被final进行修饰),且通过直接赋值初始化,JVM会将该自定义常量默认为字面值常量
 *
 */
public class StringDemo08 {
	public static final String s1 = "HelloWorld";
	public static final String s2 = "HelloWorld";
	public static final String s3 = "Hello";
	public static final String s4 = "World";
	public static final String s5;
	public static final String s6;
	public static final String s7;
	public static final String s8;

	static {
		s5 = "HelloWorld";
		s6 = "HelloWorld";
		s7 = "Hello";
		s8 = "World";
	}

	public static void main(String[] args) {
		System.out.println(s1 == s2);//true
		System.out.println(s5 == s6);//true
		System.out.println(s1 == s5);//true  s1,s2,s5,s6都指向常量池
		System.out.println("===============================================");

		System.out.println(s1 == s3 + s4);//true
		System.out.println(s5 == s7 + s8);//false
		System.out.println("===============================================");

		/*final byte b1;
		b1 = 3;
		final byte b2;
		b2 = 4;
		byte sum = b1 + b2;*/
	}
}

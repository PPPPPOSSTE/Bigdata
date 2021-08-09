package com.ftrue.day14.integer;

/**
 * @ClassName IntegerDemo05
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月14日 16时08分
 * @Version 1.0
 *
 * 包装类的笔试题1:
 */
public class IntegerDemo05 {
	public static void main(String[] args) {
		int num01 = 400;
		int num02 = 400;
		System.out.println(num01 == num02);//true
		System.out.println("==================================");

		Integer num03 = new Integer(300);
		Integer num04 = new Integer(300);
		System.out.println(num03 == num04);//false
		System.out.println("==================================");

		Integer num05 = 200;//先在常量池中有没有200,没有200,直接在堆内存中new
		Integer num06 = 200;
		System.out.println(num05 == num06);
		System.out.println("==================================");

		Integer num07 = 100;//先在常量池中有没有100,含有100,将num07直接指向常量池100
		Integer num08 = 100;
		System.out.println(num07 == num08);
		System.out.println("==================================");

		int num09 = 200;
		Integer num10 = 200;
		System.out.println(num09 == num10);//true 自动拆箱
		System.out.println(num10 == num09);//true 一切从简
	}
}

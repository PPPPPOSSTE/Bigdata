package com.ftrue.day14.integer;

/**
 * @ClassName IntegerDemo06
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月14日 16时23分
 * @Version 1.0
 *
 * 包装类的笔试题2:
 *      包装类型不可以做数学运算,需要将该类型对象自动拆箱为基本数据类型才可以做数学运算
 */
public class IntegerDemo06 {
	public static final Integer num01 = 200;
	public static final Integer num02 = 200;
	public static final Integer num03 = 100;
	public static final Integer num04 = 100;
	public static final Integer num05;
	public static final Integer num06;
	public static final Integer num07;
	public static final Integer num08;

	static {
		num05 = 200;
		num06 = 200;
		num07 = 100;
		num08 = 100;
	}

	public static void main(String[] args) {
		System.out.println(num01 == num02);//false
		System.out.println(num03 == num04);//true
		System.out.println(num07 == num08);//true
		System.out.println(num03 == num07);//true

		System.out.println("====================================");

		System.out.println(num01 == num03 + num04);//将num03和num04先做自动拆箱,结果int类型200,int类型200和Integer类型200
		System.out.println(num05 == num07 + num08);//将num07和num08先做自动拆箱,结果int类型200,int类型200和Integer类型200
	}
}

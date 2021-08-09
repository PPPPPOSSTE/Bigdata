package com.ftrue.day11.poly.demo02;

/**
 * @ClassName PolyDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月10日 14时25分
 * @Version 1.0
 *
 * 多态成员的特点:实例变量
 *      和以前的调用变量的方式也是一模一样
 *      打印变量的值,具体打印什么值取决于变量名前面的数据类型
 */
public class PolyDemo02 {
	public static void main(String[] args) {
		//父new父
		SuperClass superClass = new SuperClass();
		System.out.println(superClass);
		System.out.println(superClass.num);
		System.out.println("=============================================");

		//子new子
		SubClass subClass = new SubClass();
		System.out.println(subClass);
		System.out.println(subClass.num);
		System.out.println("=============================================");

		//父new子 变量sc在内存中的数据类型SubClass,在代码中的数据类型SuperClass
		SuperClass sc = new SubClass();
		System.out.println(sc);
		System.out.println(sc.num);
		System.out.println("=============================================");


		int a = 'a';
		System.out.println(a);

		char c = 97;
		System.out.println(c);

		//打印的内容是什么取决于变量的数据类型

	}
}

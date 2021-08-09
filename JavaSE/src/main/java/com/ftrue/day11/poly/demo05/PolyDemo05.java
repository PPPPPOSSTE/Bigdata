package com.ftrue.day11.poly.demo05;

/**
 * @ClassName PolyDemo05
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月10日 15时46分
 * @Version 1.0
 *
 * 演示多态,接口在实际开发中的应用(演示,暂不需要会写)
 */
public class PolyDemo05 {
	public static void main(String[] args) {
		//方式1:今天讲解的步骤
		MyPrintInterface a = new MyPrintInterface();
		PrintUtils.print(a,"HelloWorld");
		System.out.println("=================================");

		//方式2:匿名内部类
		PrintUtils.print(new PrintInterface() {
			@Override
			public void print(String str) {
				System.out.println(str);
			}
		}, "HelloWorld");

		System.out.println("=================================");

		//方式3:Lambda表达式
		PrintUtils.print( str -> System.out.println(str),"HelloWorld");

		System.out.println("=================================");

		//方式4:方法引用
		PrintUtils.print(System.out::println,"HelloWorld");

	}
}

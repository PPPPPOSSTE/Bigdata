package com.ftrue.day11.poly.demo03;

/**
 * @ClassName PolyDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月10日 14时57分
 * @Version 1.0
 *
 * 多态下成员的特点:实例方法
 *      多态情况下调用方法,先判断父类或者父接口中是否存在这个方法
 *          如果没有,编译报错;
 *          如果有,执行子类重写后的方法
 *
 */
public class PolyDemo03 {
	public static void main(String[] args) {
		//父new父
		SuperClass superClass = new SuperClass();
		superClass.method();
		System.out.println("============================");

		//子new子
		SubClass subClass = new SubClass();
		subClass.method();
		System.out.println("============================");

		//父new子
		SuperClass sc = new SubClass();
		sc.method();
	}
}

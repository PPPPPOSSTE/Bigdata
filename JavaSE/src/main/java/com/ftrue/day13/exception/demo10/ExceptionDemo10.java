package com.ftrue.day13.exception.demo10;

/**
 * @ClassName ExceptionDemo10
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月13日 14时17分
 * @Version 1.0
 *
 * 自定义异常:
 *      自定义编译时异常
 *      自定义运行时异常
 *
 *
 * 自定义运行时异常的步骤:
 *      1.创建自定义运行时异常类,并继承RuntimeException类
 *          RuntimeException类及其子类们都是运行时时异常
 *      2.至少根据父类生成两个构造器
 *          无参构造器
 *          含有String参数的构造器
 *
 *
 * 自定义编译时异常的步骤:
 *      1.创建自定义编译时异常,并继承Exception类
 *          Exception类及其子类们(RuntimeException类及其子类们除外)都是编译时异常
 *      2.至少根据父类生成两个构造器
 *          无参构造器
 *          含有String参数的构造器
 */
public class ExceptionDemo10 {
	public static void main(String[] args) {
		//抛出并创建自定义运行时异常
		//throw new MyRuntimeException("自定义运行时异常");

		//抛出并创建自定义编译时异常
		try {
			throw new MyException("自定义编译时异常");
		} catch (MyException e) {
			System.out.println("解决方案");
		}
	}
}

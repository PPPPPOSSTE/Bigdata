package com.ftrue.day13.exception.demo01;

/**
 * @ClassName ExceptionDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月13日 08时45分
 * @Version 1.0
 *
 * 程序中常见错误类型:
 *      语法格式错误
 *          idea
 *      程序逻辑错误
 *          idea中debug
 *      程序中的异常
 *          异常处理
 *
 * 异常:
 *      在程序运行的过程中,出现了非正常的情况,从而导
 *
 *
 */
public class ExceptionDemo01 {
	public static void main(String[] args) {
		System.out.println("开始");
		try {
			System.out.println("1/0");
			System.out.println(1/0);
		} catch (Exception e) {
			System.out.println("后续的操作,解决方案");
		}

		System.out.println("结束");
	}
}

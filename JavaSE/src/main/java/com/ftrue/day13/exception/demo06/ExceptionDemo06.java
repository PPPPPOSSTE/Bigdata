package com.ftrue.day13.exception.demo06;

import java.io.IOException;

/**
 * @ClassName ExceptionDemo06
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月13日 10时47分
 * @Version 1.0
 *
 * 异常的捕获:
 *      格式:
 *          try {
 *              可能存在异常的代码
 *          } catch (异常类名 对象名) {
 *              解决方案
 *          }
 *
 *
 *      执行流程:
 *          1.执行try{}中的代码,看是否会发生异常
 *          2.如果没有发生异常,异常捕获语句结束,继续往下执行;
 *            如果发生异常,JVM自动匹配到对应的catch()中异常,执行{}中的解决方案,异常捕获语句结束,继续往下执行;
 */
public class ExceptionDemo06 {
	public static void main(String[] args) {
		method(2);
	}

	public static void method (int a) {
		System.out.println("开始");

		try {
			if (a == 1) {
				throw new IOException("自定义IO异常");
			}
		} catch (IOException e) {
			System.out.println("IO异常的解决方案");
		}

		System.out.println("结束");
	}
}

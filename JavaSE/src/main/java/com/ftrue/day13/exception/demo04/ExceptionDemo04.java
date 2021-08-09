package com.ftrue.day13.exception.demo04;

import java.io.IOException;

/**
 * @ClassName ExceptionDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月13日 09时36分
 * @Version 1.0
 *
 * 异常处理:
 *      异常抛出:throw
 *      异常声明:throws
 *      异常捕获:try,catch,finally
 *
 *
 * 异常的抛出:
 *      异常对象进行创建,并且让异常对象在JVM所有的对象中脱颖而出
 *
 * 格式:
 *      throw new 异常类名(实参);
 *
 *
 * 异常的声明:
 *      含义:在出现异常的方法上进行异常的声明,交给该方法的调用者进行异常的处理
 *      格式:
 *          修饰符 返回值类型 方法名 () throws 异常类名1,异常类名2,......,异常类名n {
 *
 *          }
 */
public class ExceptionDemo04 {
	public static void main(String[] args) throws IOException {
		System.out.println("开始");
		method(1);
		System.out.println("结束");
	}

	public static void method (int a) throws IOException {
		if (a == 1) {
			throw new IOException("自定义IO异常");
		}
	}
}

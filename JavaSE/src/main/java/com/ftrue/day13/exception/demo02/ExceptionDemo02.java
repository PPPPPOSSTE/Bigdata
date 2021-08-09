package com.ftrue.day13.exception.demo02;

/**
 * @ClassName ExceptionDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月13日 09时10分
 * @Version 1.0
 *
 * Throwable体系结构:
 *      Error(错误)
 *          错误比喻程序的"绝症",是程序员无法根治的,只能事先避免
 *      Exception(异常)
 *          异常比喻程序中的"小毛病",是程序员可以通过代码可以直接进行修复,可以解决
 *
 *
 * Throwable类:
 *      类的特点
 *          Throwable 类是 Java 语言中所有错误或异常的父类
 *      类的位置
 *          java.lang
 *      类的构造器
 *          public Throwable()
 *              构造一个将 null 作为其详细消息的新 throwable。
 *          public Throwable(String message)
 *              构造带指定详细消息的新 throwable
 *      类的方法
 *          public String getMessage()
 *              返回此 throwable 的详细消息字符串。
 *          public void printStackTrace()
 *              将此 throwable 及其追踪输出至标准错误流。
 */
public class ExceptionDemo02 {
	public static void main(String[] args) {
		//创建Throwable对象
		Throwable t = new Throwable("自定义Throwable");

		//打印Throwable对象的详细信息
		t.printStackTrace();
		System.out.println("=============================");
		//打印Throwable对象的出现的原因
		System.out.println(t.getMessage());

	}
}

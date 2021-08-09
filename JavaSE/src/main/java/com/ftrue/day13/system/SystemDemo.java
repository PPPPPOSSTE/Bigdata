package com.ftrue.day13.system;

/**
 * @ClassName SystemDemo
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月13日 14时32分
 * @Version 1.0
 *
 * System类
 *      类的特点
 *          System 类包含一些通用的类字段和方法
 *      类的位置
 *          java.lang
 *      类的构造器
 *          构造器私有化,无法在外界实例化对象
 *      类的方法
 *          public static void gc()
 *              运行垃圾回收器。
 *          public static long currentTimeMillis()
 *              返回以毫秒为单位的当前时间。
 *          public static long nanoTime()
 *              返回最准确的可用系统计时器的当前值，以毫微秒为单位
 *          public static void setOut(PrintStream out)
 *              重新分配“标准”输出流。
 */
public class SystemDemo {
	public static void main(String[] args) {
		long start = System.nanoTime();

		for (int i = 0; i < 10000; i++) {

		}

		long end = System.nanoTime();


		System.out.println(end - start);
	}
}

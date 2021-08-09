package com.ftrue.day11.poly.demo05;

/**
 * @ClassName PrintUtils
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月10日 15时48分
 * @Version 1.0
 *
 * 模拟是API中的提供的工具类,将接口做为方法的形参
 *
 */
public class PrintUtils {
	public static void print (PrintInterface inter , String str) { //在传参的时候发生多态
		inter.print(str);//根据多态情况调用方法,....
	}
}

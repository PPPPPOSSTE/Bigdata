package com.ftrue.day08.sta.demo06;

/**
 * @ClassName StaticDemo06
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月06日 14时38分
 * @Version 1.0
 *
 * 静态代码块
 *      位置:成员
 *
 *      格式:
 *          static {
 *
 *          }
 *
 *      作用:
 *          1.负责一些变量的初始化
 *          2.负责给自定义常量进行初始化(day11时候讲解)
 *          3.笔试题(day12时候讲解)
 *
 *      注意事项:
 *          1.静态代码块是随着类的加载而加载,而且只加载唯一的一次
 *          2.静态代码块中无法使用实例成员
 *          3.静态代码块中无法使用this关键字和super关键字
 */
public class StaticDemo06 {
	public static void main(String[] args) {
		//创建学生类
		Student s1 = new Student();
		Student s2 = new Student();
	}
}

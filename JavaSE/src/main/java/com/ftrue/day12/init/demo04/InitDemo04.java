package com.ftrue.day12.init.demo04;

/**
 * @ClassName InitDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月12日 15时19分
 * @Version 1.0
 *
 * 初始化过程:
 *      1.类的初始化过程(只加载唯一的一次,而且在JVM调用主方法之前)
 *          静态变量的显式初始化或静态代码块(二者的初始化优先级一样,谁在前,优先初始化谁)
 *      2.实例变量的隐式初始化
 *      3.实例的初始化过程
 *          (1)super()
 *          (2)实例变量的显式初始化或构造器代码块(二者的初始化优先级一样,谁在前,优先初始化谁)
 *          (3)构造器中的显式代码
 */
public class InitDemo04 {
	public static void main(String[] args) {
		new SubClass();
	}
}

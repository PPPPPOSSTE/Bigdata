package com.ftrue.day12.init.demo01;

/**
 * @ClassName InitDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月12日 13时58分
 * @Version 1.0
 *
 * 初始化
 *      实例的初始化过程
 *      类的初始化过程
 *
 * 实例的初始化过程:
 *      一个类的实例初始化过程:
 *          (1)实例变量的显式初始化或者构造器代码块(二者优先级一样,谁在前先加载谁)
 *          (2)构造器中的显式代码
 *      子父类
 */
public class InitDemo01 {
	public static void main(String[] args) {
		SubClass sc = new SubClass();
	}
}

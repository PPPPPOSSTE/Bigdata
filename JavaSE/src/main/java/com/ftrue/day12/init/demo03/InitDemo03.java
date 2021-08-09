package com.ftrue.day12.init.demo03;

/**
 * @ClassName InitDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月12日 14时35分
 * @Version 1.0
 *
 * 实例变量的隐式初始化
 *      (1)在父类构造器中调用的method()是子类的还是父类的?答案:子类的
 *      (2)内存图解
 */
public class InitDemo03 {
	public static void main(String[] args) {
		SubClass sc = new SubClass();
	}
}

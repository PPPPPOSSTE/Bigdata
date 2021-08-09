package com.ftrue.day11.fin.demo03;

/**
 * @ClassName FinalDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月10日 08时52分
 * @Version 1.0
 *
 * 被final关键字修饰的变量(静态,实例,局部)
 *
 * 被final关键字修饰的局部变量
 *      直接定义初始化
 *          不可以被重新赋值
 *      先定义后初始化
 *          只能被赋值一次,然后不可以被重新赋值
 *
 * 被final修饰的变量其实就是自定义常量
 *      修饰符 final 数据类型 常量名 = 初始化值;
 *
 * 常量名的命名规范:
 *      一个单词:单词全部大写
 *      多个单词:单词全部大写,且每个单词间用下划线进行连接
 */
public class FinalDemo03 {
	public static void main(String[] args) {
		//直接定义初始化
		//final int num = 10;

		//先定义后初始化
		final int num;
		num = 10;
		//num = 20;
	}
}

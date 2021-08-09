package com.ftrue.day07.demo11;

/**
 * @ClassName OOPDemo11
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月05日 16时15分
 * @Version 1.0
 *
 * 构造器代码块:
 *      位置:
 *          成员
 *      格式:
 *          {
 *
 *          }
 *      特点:
 *          1.构造器代码块中的内容优先于构造器中的显式代码
 *          2.每new一个对象构造器代码块就是被执行一次
 *
 * 应用场景:
 *      当多个构造器出现了相同代码时,需要将这些相同的代码抽取到构造器代码块中,提高开发效率
 */
public class OOPDemo11 {
	public static void main(String[] args) {
		new Student();
		System.out.println("=======================");
		new Student(1);
	}
}

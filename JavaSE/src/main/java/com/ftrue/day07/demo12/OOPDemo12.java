package com.ftrue.day07.demo12;

/**
 * @ClassName OOPDemo12
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月05日 16时26分
 * @Version 1.0
 *
 * this关键字的第二种用法:
 *      应用场景:
 *          在(子)类的构造器中
 *      格式:
 *          this(实参);
 *      含义:
 *          当构造器本身无能力进行初始化的时候,调用本类中其它的构造器完成初始化
 *
 * 问题:在内存中存在几个学生对象?
 *      一个
 *
 *
 */
public class OOPDemo12 {
	public static void main(String[] args) {
		new Student();
	}
}

package com.ftrue.day07.demo06;

/**
 * @ClassName OOPDemo06
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月05日 14时34分
 * @Version 1.0
 *
 * 有参的构造器
 *      给对象的成员进行赋值操作
 *
 * 在使用对象的过程中,给对象成员进行赋值的方式有:
 *      (1)封装思想的set()
 *      (2)有参的构造器
 *
 * 结论:有参的构造器和封装思想的set()二者完全一样,对于不对?
 *      错误,set()只能赋值,构造器除了赋值还有初始化作用
 *
 * 在使用对象的过程中,获取对象的成员的方式有:
 *      (1)封装思想的get()
 *
 *
 */
public class OOPDemo06 {
	public static void main(String[] args) {
		//通过有参构造器(满参构造器)创建对象
		Student s = new Student("张小芳", 18);

		System.out.println(s.getName() + "=" + s.getAge());
	}
}

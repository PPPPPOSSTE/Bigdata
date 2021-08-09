package com.ftrue.day08.sta.demo01;

/**
 * @ClassName StaticDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月06日 10时17分
 * @Version 1.0
 *
 * static关键字:
 *      静态的,共享的
 *
 * 实例变量或者实例方法是每个对象都拥有一份,属于对象
 *
 * static关键字可以用来修饰变量,方法,代码块
 *
 * 静态变量:
 *      声明在类中方法外,且含有static关键字修饰的变量
 *
 * 格式:
 *      修饰符 static 数据类型 变量名;
 *
 * 含义:
 *      被static修饰的变量不再属于对象本身,而且直接归属于类,会被这个类创建的所有对象所共享
 *
 * 调用格式:
 *      类名.静态变量名;
 *
 * 静态成员在内存中的特点:
 *      随着类的加载而加载,只加载唯一的一次(字节码文件只加载唯一的一次)
 */
public class StaticDemo01 {
	public static void main(String[] args) {
		//创建三个学生对象
		Student.classroom = "射雕";

		Student s1 = new Student("郭靖", 18);
		Student s2 = new Student("黄蓉", 16);
		Student s3 = new Student("洪七公", 50);

		System.out.println(s1.print());
		System.out.println(s2.print());
		System.out.println(s3.print());

		System.out.println("=============================");

		//通知大家明天换教室,新的教室:神雕
		Student.classroom = "神雕";

		System.out.println(s1.print());
		System.out.println(s2.print());
		System.out.println(s3.print());
	}
}

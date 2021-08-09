package com.ftrue.day07.demo08;

/**
 * @ClassName OOPDemo08
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月05日 15时31分
 * @Version 1.0
 *
 * 匿名对象:没有名字的对象
 *
 *
 * 匿名对象的好处:
 *      1.减少对象在堆内存中存在的时间,提高内存的使用率
 * 匿名对象的弊端:
 *      1.对象只能使用唯一的一次
 */
public class OOPDemo08 {
	public static void main(String[] args) {
		//创建学生对象
		Student s = new Student();//堆内存中的对象和栈内存中main()的引用s做了相关指向
		//堆内存中的对象至少要等main()结束后,才会被认定为垃圾数据
		method(s);
		method(s);

		System.out.println("=====================================");

		method(new Student());//调用方法时,直接创建对象,进行传入,当method()调用完毕学生对象就会被认定为垃圾对象
		method(new Student());
	}

	public static void method (Student s) {
		System.out.println(s);
	}
}

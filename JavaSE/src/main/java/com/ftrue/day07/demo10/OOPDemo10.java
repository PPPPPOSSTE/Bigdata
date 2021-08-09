package com.ftrue.day07.demo10;

/**
 * @ClassName OOPDemo10
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月05日 16时07分
 * @Version 1.0
 *
 * 类中的私有方法
 *      类中的私有方法其实就是多个方法抽取出来的共性内容,
 *      并共性内容所属方法不想被外界所访问,可以将类中这个共性内容方法用private进行修饰
 *
 *
 *      private 修饰符 返回值类型 方法名 () {}
 *
 */
public class OOPDemo10 {
	public static void main(String[] args) {
		//创建学生对象
		Student s = new Student();

		//调用学生对象的method
		s.method01();
		System.out.println("=============================");
		s.method02();
		System.out.println("=============================");
		//s.method();
	}
}

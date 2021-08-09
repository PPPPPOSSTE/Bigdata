package com.ftrue.day07.demo04;

/**
 * @ClassName OOPDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月05日 11时41分
 * @Version 1.0
 */
public class OOPDemo04 {
	public static void main(String[] args) {
		//创建学生对象
		Student s = new Student();

		//给学生对象进行赋值
		s.setName("张小芳");
		s.setAge(18);

		//调用学生的学生方法
		s.study();
	}
}

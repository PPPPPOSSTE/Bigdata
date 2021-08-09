package com.ftrue.day16.set;

import java.util.HashSet;

/**
 * @ClassName SetDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月17日 15时14分
 * @Version 1.0
 */
public class SetDemo04 {
	public static void main(String[] args) {
		//创建存储学生对象的集合
		HashSet<Student> set = new HashSet<>();

		//创建学生对象
		Student s1 = new Student("古力娜扎", 18, 210625001);
		Student s2 = new Student("迪丽热巴", 18, 210625002);
		Student s3 = new Student("玛尔扎哈", 18, 210625003);
		Student s4 = new Student("玛尔扎哈", 18, 210625003);

		//添加学生对象
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);

		System.out.println(set);
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}
}

package com.ftrue.day16.set.demo07;

import java.util.TreeSet;

/**
 * @ClassName SetSDemo07
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月17日 16时24分
 * @Version 1.0
 *
 * 使用自然顺序存储自定义对象
 *      1.在自定义类型的类中实现Comparable接口
 *      2.重写接口中的compareTo()
 *
 * Comparable接口
 *      接口的特点
 *          此接口强行对实现它的每个类的对象进行整体排序。
 *      接口的位置
 *          java.lang
 *      接口的方法
 *          int compareTo(T o)
 *              比较此对象与指定对象的顺序。
 */
public class SetSDemo07 {
	public static void main(String[] args) {
		//创建存储学生对象的TreeSet集合对象
		TreeSet<Student> set = new TreeSet<>();

		//创建学生对象
		Student s1 = new Student("张小芳", 18, 210625005);
		Student s2 = new Student("张小弛", 18, 210625004);
		Student s3 = new Student("安小妮", 18, 210625001);
		Student s4 = new Student("崔小荣", 18, 210625003);
		Student s5 = new Student("李小朦", 18, 210625002);

		//添加学生对象
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);

		System.out.println(set);
	}
}

package com.ftrue.day16.set.demo08;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @ClassName SetDemo08
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月17日 16时57分
 * @Version 1.0
 *
 * 使用定制顺序完成存储自定义对象
 *      1.创建Comparator<T>实现类
 *      2.在实现类中重写compare(),完成比较规则
 *      3.在测试类中创建Comparator<T>实现类对象
 *      4.将实现类对象作为参数,创建TreeSet集合对象
 *
 */
public class SetDemo08 {
	public static void main(String[] args) {
		//3.在测试类中创建Comparator<T>实现类对象
		//MyComparator my = new MyComparator();


		//创建存储学生对象的TreeSet集合对象
		//TreeSet<Student> set = new TreeSet<>(my);

		//使用匿名内部类完成上述两步简化工作
		TreeSet<Student> set = new TreeSet<>(new Comparator<Student>() {
			@Override
			public int compare(Student stu1, Student stu2) {
				return stu1.getId() - stu2.getId();
			}
		});

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

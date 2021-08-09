package com.ftrue.day08.sta.demo03;

/**
 * @ClassName StaticDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月06日 11时25分
 * @Version 1.0
 *
 * 学生分配学号
 */
public class StaticDemo03 {
	public static void main(String[] args) {
		//使用有参构造器创建学生对象
		Student s1 = new Student("张小芳", 18);
		Student s2 = new Student("张小弛", 18);
		Student s3 = new Student("安小妮", 18);
		Student s4 = new Student("崔小荣", 18);
		//Student s5 = new Student("李小朦", 18);
		//使用无参构造器创建学生对象
		Student s5 = new Student();
		s5.setName("李小朦");
		s5.setAge(18);

		System.out.println(s1.print());
		System.out.println(s2.print());
		System.out.println(s3.print());
		System.out.println(s4.print());
		System.out.println(s5.print());
	}
}

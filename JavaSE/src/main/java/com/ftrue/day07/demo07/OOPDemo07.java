package com.ftrue.day07.demo07;

/**
 * @ClassName OOPDemo07
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月05日 15时10分
 * @Version 1.0
 *
 * JavaBean标准类:
 *      程序员针对类进行约定俗成一种设计标准
 *
 *
 * 标准:
 *      1.一个.java文件只允许含有一个类文件(class,enum,interface)
 *      2.必须有:
 *          (1)成员变量必须全部私有化
 *          (2)公共访问方式set()和get()
 *          (3)无参构造器
 *      3.可以有:
 *          (1)满参的构造器或者合适参数的构造器
 *          (2)构造器代码块(暂时没有讲)
 *          (3)静态代码块(暂时没有讲)
 *          (4)内部类(暂时没有讲)
 *          (5)特殊的实例方法(暂时没有讲)
 *              toString();
 *              hashCode();
 *              equals();
 *       4.不能有:
 *          (1)自定义常量
 *          (2)抽象方法
 *          (3)普通的实例方法
 *              除了公共的访问方式和toString(), hashCode(),equals()
 *          (4)静态方法
 *
 *
 *  idea代码自动生成快捷键:
 *      Alt + Ins(ert)
 */
public class OOPDemo07 {
	public static void main(String[] args) {
		//通过无参构造器创建对象
		Student s1 = new Student();
		s1.setName("张小芳");
		s1.setAge(18);

		//通过有参的构造器创建对象
		Student s2 = new Student("张大芳", 18);


		System.out.println(s1.getName() + "=" + s1.getAge());
		System.out.println(s2.getName() + "=" + s2.getAge());
	}
}

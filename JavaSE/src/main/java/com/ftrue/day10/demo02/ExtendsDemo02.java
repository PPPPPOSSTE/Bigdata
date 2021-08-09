package com.ftrue.day10.demo02;

/**
 * @ClassName ExtendsDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月09日 09时18分
 * @Version 1.0
 *
 * 继承的特点:
 *      私有成员
 *      静态成员
 *      构造器
 *      实例变量
 *      实例方法
 *
 *
 * 继承的特点1:私有成员
 *      官方结论:
 *          1.子类可以继承父类所有的成员(属性,方法,内部类)
 *          2.子类可以继承父类的public,protected成员(言外之意,不能继承私有和缺省)
 *          3.子类不可以继承父类的私有成员(言外之意,可以继承public,protected,缺省成员)
 *
 *      自己总结:
 *          子类可以继承父类的成员,因为受权限修饰符的约束,不可以直接进行访问,可以通过继承父类的set()和get()可以进行访问
 */
public class ExtendsDemo02 {
	public static void main(String[] args) {
		//创建子类对象
		SubClass sc = new SubClass();
	/*	System.out.println(sc.name);
		System.out.println(sc.age);*/

		System.out.println(sc.getName());
		System.out.println(sc.getAge());
	}
}

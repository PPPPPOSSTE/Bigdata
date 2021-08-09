package com.ftrue.day10.demo05;

/**
 * @ClassName ExtendsDemo05
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月09日 10时13分
 * @Version 1.0
 *
 * this关键字的第一种用法:
 *      应用场景:
 *          子类的实例方法中或者子类的构造器中
 *      格式:
 *          this.实例变量名
 *          this.实例方法名()
 *      作用:
 *          用来区分同一个类中同名的实例变量和局部变量
 *      含义:
 *          哪个对象调用了this所在的实例方法或者构造器,this就代表哪个对象
 *
 *
 * super关键字的第一种用法:
 *      应用场景:
 *          子类的实例方法中或者子类的构造器中
 *      格式:
 *          super.实例变量名
 *          super.实例方法名()
 *      作用:
 *          用来区分子父类继承关系中子类和父类同名的实例变量
 *          用来区分子父类继承关系中子类和父类同名的实例方法
 *      含义:
 *          哪个对象调用了super所在的实例方法或者构造器,super就代表哪个对象的父类引用
 */
public class ExtendsDemo05 {
	public static void main(String[] args) {
		//创建子类对象
		SubClass sc = new SubClass();
		sc.method();
	}
}

package com.ftrue.day07.demo02;

/**
 * @ClassName OOPDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月05日 10时26分
 * @Version 1.0
 *
 * 回顾:
 *      在同一作用域内不可以定义同名的变量
 *
 * 局部变量:
 *      声明在方法内部或者方法声明上的变量
 *
 * 局部变量和实例变量的区别:
 *      在代码中的位置:
 *          局部变量:方法内部或者方法声明上
 *          实例变量:类中方法外
 *      在内存中的位置:
 *          局部变量:栈内存
 *          实例变量:堆内存
 *      默认值:
 *          局部变量:没有默认值
 *          实例变量:有默认值
 *      代码中作用域:
 *          局部变量:方法中
 *          实例变量:类中(静态方法和静态代码块中无效)
 *      内存中生命周期:
 *          局部变量:随着方法的调用而加载,随着方法的出栈而消亡
 *          实例变量:随着对象的创建而加载,随着对象的消失而消亡
 *
 *
 * this关键字的第一种用法:
 *      应用场景:
 *          在(子)类的实例方法中或者构造器中
 *      格式:
 *          this.实例变量名
 *          this.实例方法名();
 *      作用:
 *          用来区分同一个类中同名的实例变量和局部变量
 *      含义:
 *          哪个对象调用了this所在的构造器或者实例方法,this就代表哪个对象
 */
public class OOPDemo02 {
	public static void main(String[] args) {
		//Var var = new Var();
		//var.method();

		Var v1 = new Var();
		System.out.println("v1 = " + v1);
		v1.show();

		System.out.println("==========================");

		Var v2 = new Var();
		System.out.println("v2 = " + v2);
		v2.show();
	}
}

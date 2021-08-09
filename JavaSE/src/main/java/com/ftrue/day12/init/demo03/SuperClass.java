package com.ftrue.day12.init.demo03;

/**
 * @ClassName SuperClass
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月12日 14时35分
 * @Version 1.0
 */
public class SuperClass {
	int num = 10;

	public SuperClass() {
		//(1)super() (2) 实例变量的显式初始化 (3)构造器中显式代码
		/*this.*/method();//隐含的多态
		//System.out.println(this);//子类的地址值
	}

	public void method() {
		System.out.println("num = " + num);
	}
}

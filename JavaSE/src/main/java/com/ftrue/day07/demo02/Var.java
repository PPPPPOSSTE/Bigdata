package com.ftrue.day07.demo02;

/**
 * @ClassName Var
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月05日 10时27分
 * @Version 1.0
 */
public class Var {
	//实例变量
	int num = 10;

	public void method () {
		//局部变量
		int num = 20;
		System.out.println("num = " + num);//20,就近原则
		System.out.println("num = " + this.num);//10

	}


	public void show() {
		System.out.println("this:" + this);
	}
}

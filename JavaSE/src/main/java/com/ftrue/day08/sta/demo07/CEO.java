package com.ftrue.day08.sta.demo07;

/**
 * @ClassName CEO
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月06日 15时09分
 * @Version 1.0
 */
public class CEO {
	//2.在类中创建唯一的对象,并用static关键字进行修饰
	private static CEO ceo = new CEO();



	//1.构造器私有化
	private CEO() {
	}

	//3.为了数据的安全性,将唯一的对象进行私有化,对外提供get()
	public static CEO getCEO() {
		return ceo;
	}
}

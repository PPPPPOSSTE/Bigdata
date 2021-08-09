package com.ftrue.day08.sta.demo07;

/**
 * @ClassName BOSS
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月06日 15时18分
 * @Version 1.0
 */
public class BOSS {
	//2.在类的成员位置上定义唯一的对象,并用static关键字进行修饰
	private static BOSS boss;

	//1.将构造器进行私有化
	private BOSS () {}

	//3.为了数据的安全性,将唯一的对象进行私有化,对外提供get(),并在第一次调用方法时创建对象
	public static BOSS getBOSS () {
		if (boss == null) {
			boss = new BOSS();
		}
		return boss;
	}
}

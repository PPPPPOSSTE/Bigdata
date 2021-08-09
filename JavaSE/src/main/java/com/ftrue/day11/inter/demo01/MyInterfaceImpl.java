package com.ftrue.day11.inter.demo01;

/**
 * @ClassName MyInterfaceImpl
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月10日 10时19分
 * @Version 1.0
 */
public class MyInterfaceImpl implements MyInterface {
	@Override
	public void print(String str) {
		System.out.println(str);
	}
}

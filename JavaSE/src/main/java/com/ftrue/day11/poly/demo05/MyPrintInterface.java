package com.ftrue.day11.poly.demo05;

/**
 * @ClassName MyPrintInterface
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月10日 15时51分
 * @Version 1.0
 */
public class MyPrintInterface implements PrintInterface {
	@Override
	public void print(String str) {
		System.out.println(str);
	}
}

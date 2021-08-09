package com.ftrue.day11.inter.demo03;

/**
 * @ClassName A
 * @Description 此接口用于演示功能
 * @Author Shark
 * @DateTime 2021年07月10日 10时48分
 * @Version 1.0
 */
public interface B {
	public default void method() {
		System.out.println("B");
	}
}

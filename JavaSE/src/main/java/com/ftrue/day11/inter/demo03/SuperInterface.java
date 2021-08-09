package com.ftrue.day11.inter.demo03;

/**
 * @ClassName SuperInterface
 * @Description 此接口用于演示功能
 * @Author Shark
 * @DateTime 2021年07月10日 10时41分
 * @Version 1.0
 */
public interface SuperInterface {
	public default void method () {
		System.out.println("接口的默认方法");
	}
}

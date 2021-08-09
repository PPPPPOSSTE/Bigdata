package com.ftrue.day11.inter.demo02;

/**
 * @ClassName SuperInterface
 * @Description 此接口用于演示功能
 * @Author Shark
 * @DateTime 2021年07月10日 10时38分
 * @Version 1.0
 */
public interface SuperInterface {

	public default void method () {
		System.out.println("被继承的方法");
	}

}

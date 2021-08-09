package com.ftrue.day11.inter.demo06;

/**
 * @ClassName SuperInterface
 * @Description 此接口用于演示功能
 * @Author Shark
 * @DateTime 2021年07月10日 11时39分
 * @Version 1.0
 */
public interface SuperInterface {
	public default void method01 () {
		//method();
		System.out.println(5);
	}

	public default void method02 () {
		//method();
		System.out.println(8);
	}

	/*private void method () {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
	}*/
}

package com.ftrue.day11.inter.demo04;

/**
 * @ClassName AnimalInterface
 * @Description 此接口用于演示功能
 * @Author Shark
 * @DateTime 2021年07月10日 11时10分
 * @Version 1.0
 */
public interface AnimalInterface {
	//需要实现类进行重写的方法:eat()
	void eat ();

	//不需要实现类重写的方法:sleep()
	default void sleep () {
		System.out.println("睡觉觉");
	}
}

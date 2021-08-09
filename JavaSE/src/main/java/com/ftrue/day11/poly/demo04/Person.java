package com.ftrue.day11.poly.demo04;

/**
 * @ClassName Person
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月10日 15时24分
 * @Version 1.0
 *
 * 行为：
 * 			keepPet(Dog dog,String something)方法
 * 				功能：喂养宠物狗，something表示喂养的东西
 * 		行为：
 * 			keepPet(Cat cat,String something)方法
 * 				功能：喂养宠物猫，something表示喂养的东西
 */
public class Person {
	/*public void keepPet(Dog dog,String something) {
		dog.eat(something);
	}

	public void keepPet(Cat cat,String something) {
		cat.eat(something);
	}*/

	public void keepPet(Animal a ,String something) {
		a.eat(something);
	}
}

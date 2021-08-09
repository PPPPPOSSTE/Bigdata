package com.ftrue.day11.poly.demo04;

/**
 * @ClassName PolyDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月10日 15时13分
 * @Version 1.0
 *
 * 多态的好处:
 *      将父类的类型或者父接口类型作为方法的形参,在调用的时候只需要传递给其改父类的子类对象或者该接口的实现类对象即可
 *      提高代码的复用性,从而提高开发效率
 *
 */
public class PolyDemo04 {
	public static void main(String[] args) {
		//创建猫对象
		Cat cat = new Cat(2,"黄");
		//创建狗对象
		Dog dog = new Dog(3,"灰");

		//创建饲养员的对象
		Person p = new Person();

		//调用饲养员喂养猫的方法
		p.keepPet(cat,"鱼");

		//调用饲养员喂养狗的方法
		p.keepPet(dog,"骨头");



	}
}

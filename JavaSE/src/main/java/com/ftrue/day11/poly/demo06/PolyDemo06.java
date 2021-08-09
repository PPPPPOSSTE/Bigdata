package com.ftrue.day11.poly.demo06;

/**
 * @ClassName PolyDemo06
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月10日 16时15分
 * @Version 1.0
 *
 * 多态的弊端:
 *      在多态的情况下,无法调用子类或者实现类的特有方法
 *
 *
 * 引用数据类型的类型转换:
 *      自动类型转换(向上转型)
 *          将子类类型的对象转换为父类类型的对象,其实就是多态
 *      强制类型转换(向下转型)
 *          将父类类型的对象转换为子类类型的对象
 *
 *     子类类型 对象名 = (子类类型)父类类型对象;
 *
 * 注意事项:
 *      引用类型的转换(向下转型)一般不推荐使用,因为可能发生ClassCastException(类型转换异常)
 *
 *
 * instanceof关键字
 *      含义:包含
 *      格式: 对象名 instanceof 数据类型
 *      作用:判断该对象在内存中是否为该数据类型或者该数据类型的子类类型
 *          如果是,返回true
 *          如果不是,返回false
 */
public class PolyDemo06 {
	public static void main(String[] args) {
		//创建猫对象
		Animal cat = new Cat(2,"黄");
		//创建狗对象
		Animal dog = new Dog(3,"灰");

		//创建饲养员的对象
		Person p = new Person();

		//调用饲养员喂养猫的方法
		p.keepPet(cat,"鱼");

		//调用饲养员喂养狗的方法
		p.keepPet(dog,"骨头");

		System.out.println("=======================================");

		if (cat instanceof Cat) {
			//将动物类型的猫转换为猫类型的猫
			//子类类型 对象名 = (子类类型)父类类型对象;
			Cat c = (Cat)cat;

			//调用猫抓老鼠的方法
			c.catchMouse();
		}


		System.out.println("=======================================");

		if (dog instanceof Cat) {
			//子类类型 对象名 = (子类类型)父类类型对象;
			Cat c2 = (Cat)dog;
			c2.catchMouse();
		}

	}
}

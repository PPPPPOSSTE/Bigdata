package com.ftrue.day11.inter.demo03;

/**
 * @ClassName InterfaceDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月10日 10时41分
 * @Version 1.0
 *
 * 默认方法的注意事项:
 *      1.当一个类既继承父类,同时也实现接口,且父类中的实例方法和接口中的默认方法发生同名,
 *      当子类调用这个方法时,执行的是父类的实例方法
 *      2.当一个不继承父类,同时实现多个接口,多个接口中有同名的默认方法,当子类调用这个方法时,
 *      编译报错,JVM会要求子类重写以实例方法的形式多个父接口中同名的默认方法
 */
public class InterfaceDemo03 {
	public static void main(String[] args) {
		SubClass sc = new SubClass();
		sc.method();
	}
}

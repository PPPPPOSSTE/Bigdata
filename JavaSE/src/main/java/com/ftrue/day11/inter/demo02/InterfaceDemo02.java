package com.ftrue.day11.inter.demo02;

/**
 * @ClassName InterfaceDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月10日 10时30分
 * @Version 1.0
 * '
 * 默认方法(JDK8.0)
 *      在继承关系中,抽取多个子类相同的行为动作,且不要子类所重写的方法,
 *      将该方法再进行抽取存放在接口中,以默认方法的形式存在
 *
 * 默认方法的应用场景:
 *      1.源码
 *      2.笔试题
 *
 * 默认方法的格式:
 *      [public] default 返回值类型 方法名 () {}
 */
public class InterfaceDemo02 {
	public static void main(String[] args) {
		SubClass sc = new SubClass();
		sc.method();
	}
}

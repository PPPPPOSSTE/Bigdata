package com.ftrue.day14.integer;

/**
 * @ClassName IntegerDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月14日 08时57分
 * @Version 1.0
 *
 * 基本数据类型和对应的包装类型之间的转换(以Integer为例)
 *      将基本数据类型转换为对应的包装类型(装箱)
 *          1.包装类型的构造器
 *          2.包装类型的静态方法valueOf(基本数据类型数据)
 *          3.自动装箱(稍后)
 *      将包装类型转换为对应的基本数据类型(拆箱)
 *          1.包装类型的实例方法xxxValue(),备注:xxx就是基本数据类型
 *          2.自动拆箱(稍后)
 */
public class IntegerDemo02 {
	public static void main(String[] args) {
		//装箱方式1:包装类型的构造器
		int num = 123;
		Integer integer01 = new Integer(num);
		System.out.println("integer01 = " + integer01);

		//装箱方式2:包装类型的静态方法valueOf(基本数据类型数据)
		Integer integer02 = Integer.valueOf(num);
		System.out.println("integer02 = " + integer02);

		System.out.println("===========================");

		//拆箱方式1:包装类型的实例方法xxxValue(),备注:xxx就是基本数据类型
		int num01 = integer01.intValue();
		System.out.println("num01 = " + num01);
	}
}

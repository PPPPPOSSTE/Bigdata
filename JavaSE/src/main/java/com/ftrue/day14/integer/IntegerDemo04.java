package com.ftrue.day14.integer;

/**
 * @ClassName IntegerDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月14日 09时21分
 * @Version 1.0
 *
 * 基本数据类型和字符串类型之间的转换
 *      将基本数据类型的数据转换成字符串类型的对象
 *          1.字符串连接符
 *          2.包装类型的实例方法toString()
 *          3.包装类型的静态方法toString(基本数据类型的数据)
 *          4.字符串String的静态方法valueOf(基本数据类型的数据)(推荐)
 *      将字符串类型的对象转换成基本数据类型的数据(Character除外)
 *          1.包装类型的构造器,再进行自动拆箱
 *          2.包装类型的静态方法parseXxx(字符串类型的对象) 备注:Xxx就是对应的基本数据,首字母大写 (推荐)
 */
public class IntegerDemo04 {
	public static void main(String[] args) {
		//基本数据类型==>字符串类型方式1:字符串连接符
		String str1 = 123 + "";//备注:字符串连接符相当于new,先在堆创建StringBuilder,再将StringBuilder类型的对象转换为String
		System.out.println("str1 = " + str1);

		//基本数据类型==>字符串类型方式2:包装类型的实例方法toString()
		Integer integer = 123;
		String str2 = integer.toString();
		System.out.println("str2 = " + str2);

		//基本数据类型==>字符串类型方式3:包装类型的静态方法toString(基本数据类型的数据)
		String str3 = Integer.toString(123);
		System.out.println("str3 = " + str3);


		//基本数据类型==>字符串类型方式4:字符串String的静态方法valueOf(基本数据类型的数据)
		String str4 = String.valueOf(123);
		System.out.println("str4 = " + str4);


		//字符串类型==>基本数据类型方式1:包装类型的构造器,再进行自动拆箱
		int num1 = new Integer("123");
		System.out.println("num1 = " + num1);

		//字符串类型==>基本数据类型方式2:包装类型的静态方法parseXxx(字符串类型的对象)
		int num2 = Integer.parseInt("456");
		System.out.println("num2 = " + num2);
	}
}

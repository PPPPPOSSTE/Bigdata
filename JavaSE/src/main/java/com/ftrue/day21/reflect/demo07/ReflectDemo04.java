package com.ftrue.day21.reflect.demo07;

import java.lang.reflect.Constructor;

/**
 * @ClassName ReflectDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月24日 09时59分
 * @Version 1.0
 *
 * 通过反射使用私有构造器创建对象
 */
public class ReflectDemo04 {
	public static void main(String[] args) throws Exception {
		//获取字节码文件对象
		Class<?> clazz = Class.forName("com.atguigu.reflect.demo04.Student");

		//获取私有构造器对象
		Constructor<?> c = clazz.getDeclaredConstructor(int.class);

		//实现暴力反射,忽略Java语法的检查
		c.setAccessible(true);

		//通过构造器对象进行对象创建
		Object obj = c.newInstance(18);

		System.out.println(obj);
	}
}

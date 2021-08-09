package com.ftrue.day21.reflect.demo06;

import java.lang.reflect.Constructor;

/**
 * @ClassName ReflectDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月24日 09时54分
 * @Version 1.0
 *
 * 通过反射使用有参构造器创建对象
 */
public class ReflectDemo03 {
	public static void main(String[] args) throws Exception {
		//获取字节码文件对象
		Class<?> clazz = Class.forName("com.atguigu.reflect.demo03.Student");
		//获取有参的构造器对象
		Constructor<?> c = clazz.getDeclaredConstructor(String.class, int.class);
		//通过有参的构造器进行对象创建
		Object obj = c.newInstance("zhangsan", 18);

		System.out.println(obj);

	}
}

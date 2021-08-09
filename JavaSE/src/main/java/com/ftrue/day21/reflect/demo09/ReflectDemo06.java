package com.ftrue.day21.reflect.demo09;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @ClassName ReflectDemo06
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月24日 11时02分
 * @Version 1.0
 *
 * Method类
 *      类的特点
 *          Method 提供关于类或接口上单独某个方法（以及如何访问该方法）的信息
 *      类的位置
 *          java.lang.reflect
 *      类的构造器
 *          构造器私有化,通过Class对象进行获取
 *      类的方法
 *          public Object invoke(Object obj,Object... args)
 *              对带有指定参数的指定对象调用由此 Method 对象表示的底层方法。
 *          public void setAccessible(boolean flag)
 *              将此对象的 accessible 标志设置为指示的布尔值。
 *
 * 通过反射使用对象的方法
 */
public class ReflectDemo06 {
	public static void main(String[] args) throws Exception {
		//获取学生字节码文件对象
		Class<?> clazz = Class.forName("com.atguigu.reflect.demo06.Student");

		//通过字节码文件对象获取构造器对象
		Constructor<?> c = clazz.getDeclaredConstructor(String.class, int.class);

		//通过构造器对象创建学生对象
		Object obj = c.newInstance("张小芳", 18);

		//通过字节码文件对象获取print()方法对象
		Method print = clazz.getDeclaredMethod("print");

		//调用print()
		Object return1 = print.invoke(obj);
		System.out.println("return1 = " + return1);

		System.out.println("=============================================");

		//通过字节码文件获取对象的eat()方法对象
		Method eat = clazz.getDeclaredMethod("eat", String.class);

		//调用eat()
		Object return2 = eat.invoke(obj, "哈根达斯");
		System.out.println("return2 = " + return2);
	}
}

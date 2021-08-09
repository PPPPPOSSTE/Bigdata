package com.ftrue.day21.reflect.demo05;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName ReflectDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月24日 09时14分
 * @Version 1.0
 *
 * Constructor类
 *      类的特点
 *          Constructor 提供关于类的单个构造方法的信息以及对它的访问权限。
 *      类的位置
 *          java.lang.reflect
 *      类的构造器
 *          构造器私有化,通过Class对象进行获取
 *      类的方法
 *          public T newInstance(Object... initargs)
 *              使用此 Constructor 对象表示的构造方法来创建该构造方法的声明类的新实例，并用指定的初始化参数初始化该实例。
 *          public void setAccessible(boolean flag)
 *              将此对象的 accessible 标志设置为指示的布尔值。值为 true 则指示反射的对象在使用时应该取消 Java 语言访问检查。值为 false 则指示反射的对象应该实施 Java 语言访问检查。
 *
 * 通过反射使用无参构造器创建对象
 *      1.获取字节码文件Class对象
 *      2.获取构造器对象
 *      3.通过构造器对象进行对象的创建
 *
 * 如果通过反射使用无参构造器创建对象的话,可以将上述过程简化如下:
 *      1.获取字节码文件Class对象
 *      2.通过Class对象的实例方法newInstance()进行对象的创建
 */
public class ReflectDemo02 {
	public static void main(String[] args) throws Exception {
		//1.获取字节码文件Class对象
		Class<?> clazz = Class.forName("com.atguigu.reflect.demo02.Student");

		//2.获取构造器对象
		Constructor<?> c = clazz.getDeclaredConstructor();

		//3.通过构造器对象进行对象的创建
		Object obj = c.newInstance();

		System.out.println(obj);

		System.out.println("==================================");

		//1.获取字节码文件Class对象
		clazz = Class.forName("com.atguigu.reflect.demo02.Student");

		//2.通过Class对象的实例方法newInstance()进行对象的创建
		obj = clazz.newInstance();
		System.out.println(obj);
	}
}

package com.ftrue.day21.reflect.demo08;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @ClassName ReflectDemo05
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月24日 10时20分
 * @Version 1.0
 *
 * Field类
 *      类的特点
 *          Field 提供有关类或接口的单个字段的信息，以及对它的动态访问权限
 *      类的位置
 *          java.lang.reflect
 *      类的构造器
 *          构造器私有化,通过Class对象进行获取
 *      类的方法
 *          public Object get(Object obj)
 *              返回指定对象上此 Field 表示的字段的值。
 *          public void set(Object obj,Object value)
 *              将指定对象变量上此 Field 对象表示的字段设置为指定的新值。
 *          public void setAccessible(boolean flag)
 *              将此对象的 accessible 标志设置为指示的布尔值。
 *
 * 通过反射方式获取对象的属性
 */
public class ReflectDemo05 {
	public static void main(String[] args) throws Exception {
		//创建字节码文件对象
		Class<?> clazz = Class.forName("com.atguigu.reflect.demo05.Student");

		//获取有参的构造器对象
		Constructor<?> c = clazz.getDeclaredConstructor(String.class, int.class);

		//通过构造器对象创建学生对象
		Object obj = c.newInstance("zhangsan", 18);

		//通过字节码文件对象获取"姓名"属性对象
		Field name = clazz.getDeclaredField("name");

		//使用暴力反射忽略里面的Java语法的检查
		name.setAccessible(true);

		//获取姓名的值
		System.out.println(name.get(obj));
		//针对对象存储姓名值
		name.set(obj,"张小芳");
		//获取姓名的值
		System.out.println(name.get(obj));

		System.out.println("==========================================================");



		//通过字节码文件对象获取"年龄"属性对象
		Field age = clazz.getDeclaredField("age");

		//使用暴力反射针对年龄属性忽略java语法检查
		age.setAccessible(true);

		//获取年龄的值
		System.out.println(age.getInt(obj));

	}
}

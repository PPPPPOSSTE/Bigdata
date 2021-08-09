package com.ftrue.day21.reflect.demo10;

import java.lang.reflect.Array;

/**
 * @ClassName ReflectDemo07
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月24日 11时29分
 * @Version 1.0
 *
 * 通过反射创建数组并使用
 *
 * Array类
 *      类的特点
 *          Array 类提供了动态创建和访问 Java 数组的方法。
 *      类的位置
 *          java.lang.reflect
 *      类的构造器
 *          构造器私有化,通过静态方法获取对象
 *      类的方法
 *          public static Object newInstance(Class<?> componentType,int length)
 *              创建一个具有指定的组件类型和长度的新数组。
 *          public static Object get(Object array,int index)
 *              返回指定数组对象中索引组件的值
 *          public static void set(Object array,int index,Object value)
 *              将指定数组对象中索引组件的值设置为指定的新值。
 *          public static int getLength(Object array)
 *              以 int 形式返回指定数组对象的长度。
 */
public class ReflectDemo07 {
	public static void main(String[] args) {
		//创建长度为3的int类型数组
		Object arr01 = Array.newInstance(int.class, 3);//{0,0,0}
		//存储数据
		Array.setInt(arr01,0,11);
		Array.setInt(arr01,1,22);
		Array.setInt(arr01,2,33);
		//遍历数组
		for (int i = 0; i < Array.getLength(arr01) ; i++) {
			System.out.println(Array.getInt(arr01,i));
		}
		System.out.println("================================");

		//创建长度为3的String类型数组
		Object arr02 = Array.newInstance(String.class, 3);// {null,null,null}
		//存储数据
		Array.set(arr02,0,"金牌");
		Array.set(arr02,1,"银牌");
		Array.set(arr02,2,"铜牌");
		//遍历数组
		for (int i = 0; i < Array.getLength(arr02) ; i++) {
			System.out.println(Array.get(arr02,i));
		}
		System.out.println("================================");

		//创建长度为3的学生类型数组
		Object arr03 = Array.newInstance(Student.class, 3);
		//存储数据
		Array.set(arr03,0,new Student("迪丽热巴",18));
		Array.set(arr03,1,new Student("古力娜扎",18));
		Array.set(arr03,2,new Student("玛尔扎哈",38));
		//遍历数组
		for (int i = 0; i < Array.getLength(arr03); i++) {
			System.out.println(Array.get(arr03,i));
		}

	}
}

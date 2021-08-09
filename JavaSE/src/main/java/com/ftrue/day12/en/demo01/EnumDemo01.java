package com.ftrue.day12.en.demo01;

/**
 * @ClassName EnumDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月12日 11时04分
 * @Version 1.0
 *
 * 枚举:
 *     创建固定数量对象的简化方式
 *
 * 通过单例的思路完成创建固定数量的对象
 *      1.私有化构造器
 *      2.创建固定数量的对象,并用static进行修饰
 *      3.符合封装的思想,对固定数量的对象添加private进行修饰,并提供公共获取方式
 *
 * 枚举类的格式:
 *      public enum 枚举类类名 {
 *          对象名1(实参),对象名2(实参),.......,对象名n(实参);
 *      }
 *
 */
public class EnumDemo01 {
	public static void main(String[] args) {
		System.out.println(Gender.getBoy());
		System.out.println(Gender.getGirl());

		System.out.println("===================================");

		System.out.println(Sex.boy == Sex.boy);
	}
}

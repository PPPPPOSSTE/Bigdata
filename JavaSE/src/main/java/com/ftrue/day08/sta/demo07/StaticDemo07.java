package com.ftrue.day08.sta.demo07;

/**
 * @ClassName StaticDemo07
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月06日 15时03分
 * @Version 1.0
 *
 * 设计模式和框架区别:
 *      设计模式:解决某一类问题专一的解决方案
 *      框架:半成品项目
 *
 * 单例设计模式:
 *      创建唯一对象的解决方案
 *
 * 单例设计模式的分类:
 *      立即加载(饿汉式)
 *      延迟加载(懒汉式)
 *
 * 立即加载模式(饿汉式)
 *      1.将构造器进行私有化
 *      2.在类中创建唯一的对象,并用static关键字进行修饰
 *      3.为了数据的安全性,将唯一的对象进行私有化,对外提供get()
 *
 * 延迟加载模式(懒汉式) 推荐
 *      1.将构造器进行私有化
 *      2.在类的成员位置上定义唯一的对象,并用static关键字进行修饰
 *      3.为了数据的安全性,将唯一的对象进行私有化,对外提供get(),并在第一次调用方法时创建对象
 */
public class StaticDemo07 {
	public static void main(String[] args) {
		CEO ceo1 = CEO.getCEO();
		System.out.println(ceo1);
		CEO ceo2 = CEO.getCEO();
		System.out.println(ceo2);
	}
}

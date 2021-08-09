package com.ftrue.day21.reflect.demo03;

/**
 * @ClassName ReflectDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月23日 16时26分
 * @Version 1.0
 *
 * 类初始化的五种方式:
 *      1.运行主方法所在的类，要先完成类初始化，再执行main方法
 *      2.调用某个类的静态成员（类变量和类方法），此时这个类没有初始化的话，先完成类初始化
 *      3.第一次使用某个类型就是在new它的对象，此时这个类没有初始化的话，先完成类初始化再做实例初始化
 *      4.子类初始化时，发现它的父类还没有初始化的话，那么先初始化父类
 *      5.通过反射操作某个类时，如果这个类没有初始化，也会导致该类先初始化
 *
 * 反射:
 *      会使用反射的方式完成 Student s = new Student();
 *
 * 反射的理解:
 *      是Java基础通往Java高级的桥梁
 *
 *      Java基础:仅限会使用知识点或者API敲代码
 *      Java高级:除了满足Java基础,还可以会看源码
 *
 *      框架:半成品项目(设计模式+反射+逻辑代码)
 *
 * 反射的好处与弊端:
 *      好处:
 *          通过反射创建对象和普通new出来的对象创建的方式不同
 *          new出来的对象是强类型的对象,当使用完毕后,当这个对象和其它内存区域没有任何关联时候,先会被认定为垃圾数据,等到垃圾回收器清理到该片内存为止
 *          通过反射创建出来的对象,是弱类型的对象(一次性),使用完毕直接被垃圾回收器回收
 *      弊端:
 *          通过反射创建对象并使用方法的步骤要比普通new出来的对象使用步骤麻烦很多
 *
 * Java类加载器分类:
 *     根类加载器
 *          它负责加载\jdk1.8.0_202\jre\lib\rt.jar核心库
 *          它本身不是Java代码实现的，也不是ClassLoader的子类，获取它的对象时往往返回null
 *     扩展类加载器
 *          它负责加载jre/lib/ext扩展库
 *          它是ClassLoader的子类
 *     应用程序类加载器:
 *          它负责加载自定义java文件
 *          它是ClassLoader的子类
 *
 * 特殊的类加载器:
 *     自定义类加载器:通过Java代码自己写一个类加载器(Tomcat微型服务器)
 *
 *
 */
public class ReflectDemo03 {
	public static void main(String[] args) {
		System.out.println(ReflectDemo03.class.getClassLoader());
	}
}

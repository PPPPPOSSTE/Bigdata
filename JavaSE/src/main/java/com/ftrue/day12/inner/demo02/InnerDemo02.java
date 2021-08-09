package com.ftrue.day12.inner.demo02;

/**
 * @ClassName InnerDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月12日 09时18分
 * @Version 1.0
 *
 * 在成员内部类中需要声明实例成员的时候,会将这些实例成员声明在实例成员内部类,
 * 但是实例成员内部中无法声明静态成员,当在成员内部类中需要声明静态成员的时候,
 * 会将这些静态成员声明在静态成员内部类中
 *
 * 静态成员内部类
 *      格式
 *          public class 外部类类名 {
 *              修饰符 static class 内部类类名 {}
 *          }
 *
 *      特点:
 *          1.内部类的权限访问级别
 *              四种都可以,推荐private
 *          2.内部类和外部类之间的访问
 *              内部类访问外部类
 *                  在内部类的静态方法可以访问外部类中全部静态成员
 *              外部类访问内部类
 *                  在外部类的静态方法可以访问内部类中全部静态成员,不过需要通过内部类类名进行访问
 *
 */
public class InnerDemo02 {
	public static void main(String[] args) {

	}
}

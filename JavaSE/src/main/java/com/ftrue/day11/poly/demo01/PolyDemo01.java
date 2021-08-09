package com.ftrue.day11.poly.demo01;

/**
 * @ClassName PolyDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月10日 14时03分
 * @Version 1.0
 *
 * 多态性:
 *      事物的多种形态
 *      对象的不同的类型
 *
 *      Student s = new Student();类型:Student
 *
 *      学生:叫张三的那个学生,0625第三排第一位,长得最漂亮的学生
 *
 *      猫:叫Tom的那只猫,爱睡懒觉的那只猫,那只爱吃鱼的喵星人,
 *
 *      ========================================================
 *
 *      在编译时时期和运行时,对象的数据类型是相同,称之为"单态"
 *          例如: Cat cat = new Cat();
 *      在编译时时期和运行时,对象的数据类型是不相同,称之为"多态"
 *          例如: Animal cat = new Cat();
 *
 *      ========================================================
 *
 * 多态的前提条件:
 *      1.要有"继承关系"或者"实现关系"
 *      2.要有方法的重写(如果没有重写,也可以构成多态的格式,但是这样的多态没有任何意义)
 *      3.格式:满足其中一点即可
 *          继承关系:父类的引用指向子类对象(父new子)
 *              父类类名 对象名 = new 子类类名();
 *          实现关系:父接口的引用指向实现类对象(父接口new实现类)
 *              父接口名 对象名 = new 实现类名();
 *          特殊格式:初始化子类对象的时候,super(),(不做为重点)
 *
 * 在多态的情况下,类中的成员会发生怎样的变化?
 *      构造器
 *      实例变量
 *      实例方法
 *
 * 多态情况下,成员的特点:构造器
 *      执行的顺序和之前(子new子)的形式一模一样
 */
public class PolyDemo01 {
	public static void main(String[] args) {
		//父new父
		SuperClass superClass = new SuperClass();
		System.out.println("================================");
		//子new子
		SubClass subClass = new SubClass();
		System.out.println("================================");
		//父new子
		SuperClass sc = new SubClass();

	}
}

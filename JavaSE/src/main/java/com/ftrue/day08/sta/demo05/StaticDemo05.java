package com.ftrue.day08.sta.demo05;

/**
 * @ClassName StaticDemo05
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月06日 14时26分
 * @Version 1.0
 *
 * 静态方法的注意事项:
 *      1.实例和静态的调用关系:在静态方法中不可以调用实例成员;
 *          实例调用实例:成立
 *          实例调用静态:成立
 *          静态调用静态:成立
 *          静态调用实例:不成立
 *        原因:类优先于对象加载,当类加载的时候,此时没有创建对象,无法识别实例成员
 *      2.在静态方法中无法使用this关键字和super关键字
 *      3.在内存中静态成员是随着类的加载而加载,而且只加载唯一的一次
 *
 */
public class StaticDemo05 {
	public static void main(String[] args) {
		//System.out.println(this);
	}

	public void method01 () {
		//method02();
	}

	public void method02 () {
		//method03();
	}

	public static void method03 () {
		//method04();
	}

	public static void method04 () { //method04()是静态的,随着类的加载而加载
		//method01();//method01()是实例的,是随着对象的调用而加载
	}

}

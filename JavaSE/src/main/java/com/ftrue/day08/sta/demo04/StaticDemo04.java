package com.ftrue.day08.sta.demo04;

/**
 * @ClassName StaticDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月06日 14时04分
 * @Version 1.0
 *
 * 静态方法:
 *      修饰符 static 返回值类型 方法名 () {}
 *
 * 调用方式:
 *      类名.方法名();
 *
 * 应用场景:
 *      当需要一个类不作为标准的JavaBean的时候,
 *      且这个类存放的内容都是具体的功能方法,
 *      在实际应用中需要大量使用该类的方法,无需将这些方法声明实例的,
 *      直接声明为静态方法,会提高开发效率,同时也提高内存的使用效率
 *
 *      注意:
 *          如果一个类,所有的方法被声明为static,
 *          方法的调用直接通过类名所调用,并且习惯将该类的构造器声明为private
 */
public class StaticDemo04 {
	public static void main(String[] args) {
		//创建数组工具类对象
		//ArrayUtils au = new ArrayUtils();
		//局部变量,当方法出栈的时候,局部变量au才会消失,
		// au消失后,堆内存中的0x666才会被认定为垃圾数据
		//考虑到当ArrayUtils对象被认定为垃圾数据的时候,主方法已经结束,基本上程序也结束了
		//这个ArrayUtils对象在堆内存存在的时间过长,可以将其在堆内存中直接根除掉


		//调用数组打印的方法
		ArrayUtils.printArr(11,22,33);
		//思考:对象占用堆内存,字节码文件占用方法区,正在运行的主方法占用栈内存
	}
}

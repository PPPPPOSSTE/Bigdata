package com.ftrue.day05;

/**
 * @ClassName ArrayDemo09
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月02日 15时41分
 * @Version 1.0
 *
 * 方法的形参:方法定义(声明)时的参数,称之为"形式参数",简称"形参"
 * 方法的实参:方法调用时的参数,称之为"实际参数",简称"实参"
 *
 * 当方法的形参是基本数据类型时:
 *      (1)传递的是变量的数据值
 *      (2)当形参数据值的改变,不影响实参的数据值
 *
 * 当方法的形参是引用数据类型是:
 *      (1)传递的是变量的内存地址值
 *      (2)当形参内存地址值的改变,不影响实参的内存地址值
 *      (3)当形参内存地址值不改变,形参内存地址值里面的数据值的改变影响实参内存地址值里面的数据值
 */
public class ArrayDemo09 {
	public static void main(String[] args) {
		/*int a = 10;
		int b = 20;
		System.out.println("a1 = " + a);//打印main()中的变量a,结果10
		System.out.println("b1 = " + b);//打印main()中的变量b,结果20
		System.out.println("==============================");
		method(a,b);//进行传参的时候,传递不是变量a和变量b,传递的是变量a和变量b的值
		System.out.println("==============================");
		System.out.println("a4 = " + a);//打印main()中的变量a,结果10
		System.out.println("b4 = " + b);//打印main()中的变量b,结果20*/

		/*int[] arr = new int[3];
		System.out.println("arr1 = " + arr);
		show(arr);
		System.out.println("arr4 = " + arr);*/


		int[] arr = {11,22,33};
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		change(arr);
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}

	public static void change (int[] arr) {
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		arr[0] = 100;
		arr[2] = 300;

		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}

	public static void show (int[] arr) {
		System.out.println("arr2 = " + arr);
		arr = new int[5];
		System.out.println("arr3 = " + arr);
	}

	public static void method (int a, int b) { //变量a和变量b是method()的变量
		System.out.println("a2 = " + a);//打印method()中的变量a,结果10
		System.out.println("b2 = " + b);//打印method()中的变量b,结果20
		System.out.println("==============================");
		a = b; //改变的是method()中的变量a的值
		b += a;//改变的是method()中的变量b的值
		System.out.println("a3 = " + a);//打印method()中的变量a,结果20
		System.out.println("b3 = " + b);//打印method()中的变量b,结果40
	}//方法结束(出栈)
}

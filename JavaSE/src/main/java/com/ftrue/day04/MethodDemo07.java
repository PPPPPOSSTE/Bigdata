package com.ftrue.day04;

/*
	方法重载的注意事项:
		1.当方法重载的时候,具体执行哪个方法,取决于方法调用的实参
*/

public class MethodDemo07 {
	public static void main (String[] args) {
		//method(3,4);
	}


	public static void method (int a , double b) {
		System.out.println("int , double");
	}

	public static void method (double a , int b) {
		System.out.println("double , int");
	}

	public static void method (byte num) {
		System.out.println("byte");
	}

	public static void method (short num) {
		System.out.println("short");
	}

	public static void method (int num) {
		System.out.println("int");
	}

	public static void method (long num) {
		System.out.println("long");
	}
}
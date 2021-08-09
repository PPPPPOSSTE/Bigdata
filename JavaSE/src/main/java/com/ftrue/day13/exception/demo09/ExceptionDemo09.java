package com.ftrue.day13.exception.demo09;

/**
 * @ClassName ExceptionDemo09
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月13日 14时00分
 * @Version 1.0
 *
 * finally关键字的注意事项:
 *      在异常捕获的时候尽量避免使用return语句
 *
 */
public class ExceptionDemo09 {
	public static void main(String[] args) {
		System.out.println(method05());
	}

	public static int method05 () {
		int a = 10;
		int b = 20;

		try {
			System.out.println("try");
			return a; //此时return 10的时候发现有finally语句,先执行finally语句,虽然针对a进行改变,但是return的值已经确定,所以return 10
		} catch (Exception e) {
			System.out.println("catch");
			return b;
		} finally {
			System.out.println("finally");
			a += b;//a = a + b
			System.out.println("a = " + a);
		}
	}

	public static int method04 () {
		int a = 10;
		int b = 20;

		try {
			System.out.println("try");
			return a;
		} catch (Exception e) {
			System.out.println("catch");
			return b;
		} finally {
			System.out.println("finally");
			return a + b;
		}
	}

	public static int method03 () {
		try {
			System.out.println("try");
			System.out.println(1/0);
			return 10;//此时准备执行return 10的时候,发现try后面有finally语句,先执行finally语句,在执行return 10
		} catch (Exception e) {
			System.out.println("catch");
			return 20;
		} finally {
			System.out.println("finally");
			return 30;
		}
	}

	public static int method02 () {
		try {
			System.out.println("try");
			//System.out.println(1/0);
			return 10;
		} catch (Exception e) {
			System.out.println("catch");
			return 20;
		}
	}

	public static int method01 () {
		try {
			System.out.println("try");
			return 10;
		} catch (Exception e) {
			System.out.println("catch");
		}

		return 20;
	}
}

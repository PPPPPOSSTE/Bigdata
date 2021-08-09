package com.ftrue.day13.exception.demo10;

/**
 * @ClassName MyException
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月13日 14时24分
 * @Version 1.0
 */
public class MyException extends Exception {
	public MyException() {
	}

	public MyException(String message) {
		super(message);
	}
}

package com.ftrue.day13.exception.demo10;

/**
 * @ClassName MyRuntimeException
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月13日 14时21分
 * @Version 1.0
 */
public class MyRuntimeException extends RuntimeException {
	public MyRuntimeException() {
	}

	public MyRuntimeException(String message) {
		super(message);
	}
}

package com.ftrue.day19.thread.demo12;

/**
 * @ClassName CEO
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月21日 16时08分
 * @Version 1.0
 */
public class CEO {
	private static CEO ceo;

	private CEO() {}


	public static CEO getCEO() {
		if (ceo == null) {
			method();
		}

		return ceo;
	}

	private static synchronized void method () {
		if (ceo == null) {
			ceo = new CEO();
		}
	}
}

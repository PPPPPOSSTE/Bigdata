package com.ftrue.day19.thread.demo02;

/**
 * @ClassName MyThread
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月21日 10时40分
 * @Version 1.0
 */
public class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run () {
		for (int i = 1; i <= 30; i++) {
			System.out.println(getName() + ":" + i);
		}
	}
}

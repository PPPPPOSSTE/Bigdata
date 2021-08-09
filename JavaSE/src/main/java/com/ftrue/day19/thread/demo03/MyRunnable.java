package com.ftrue.day19.thread.demo03;

/**
 * @ClassName MyRunnable
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月21日 11时13分
 * @Version 1.0
 */
public class MyRunnable implements Runnable{
	@Override
	public void run() {
		for (int i = 1; i <= 30; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}

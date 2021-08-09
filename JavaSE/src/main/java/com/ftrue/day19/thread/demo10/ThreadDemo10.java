package com.ftrue.day19.thread.demo10;

/**
 * @ClassName ThreadDemo10
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月21日 16时07分
 * @Version 1.0
 *
 * 在多线程中的单例设计模式
 */
public class ThreadDemo10 {
	public static void main(String[] args) {
		Runnable run = new Runnable() {
			@Override
			public void run() {
				System.out.println(CEO.getCEO());
			}
		};


		Thread t1 = new Thread(run);
		Thread t2 = new Thread(run);
		Thread t3 = new Thread(run);

		t1.start();
		t2.start();
		t3.start();
	}
}

package com.ftrue.day19.thread.demo04;

/**
 * @ClassName ThreadDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月21日 11时20分
 * @Version 1.0
 *
 * 使用匿名内部类方式简化线程开启的方式2
 *      1.在测试类中使用匿名内部类创建Runnable接口的实现类对象
 *      2.根据需求和Runnable接口的实现类对象创建合适数量的Thread对象
 *      3.开启线程
 */
public class ThreadDemo04 {
	public static void main(String[] args) {
		//1.在测试类中使用匿名内部类创建Runnable接口的实现类对象
		Runnable my = new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 30; i++) {
					System.out.println(Thread.currentThread().getName() + ":" + i);
				}
			}
		};

		//2.根据需求和Runnable接口的实现类对象创建合适数量的Thread对象
		Thread t1 = new Thread(my,"自定义线程1");
		Thread t2 = new Thread(my,"自定义线程2");

		//3.开启线程
		t1.start();
		t2.start();
	}
}

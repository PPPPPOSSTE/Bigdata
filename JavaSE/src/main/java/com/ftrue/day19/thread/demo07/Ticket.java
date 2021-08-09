package com.ftrue.day19.thread.demo07;

/**
 * @ClassName Ticket
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月21日 11时35分
 * @Version 1.0
 */
public class Ticket implements Runnable{
	//声明初始化票的张数
	private int ticket = 100;


	@Override
	public void run() {
		while (ticket > 0) {

			method();
		}
	}


	private synchronized void method () {
		if (ticket > 0) {
			//在实际开发中,此处可能存在多行功能性代码,使用sleep睡眠指定的毫秒数模拟程序执行的实现
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			String name = Thread.currentThread().getName();
			System.out.println(name + "正在卖第" + ticket-- + "张票");
		}
	}
}

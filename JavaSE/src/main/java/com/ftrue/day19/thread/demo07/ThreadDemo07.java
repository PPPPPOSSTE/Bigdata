package com.ftrue.day19.thread.demo07;

/**
 * @ClassName ThreadDemo07
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月21日 14时26分
 * @Version 1.0
 *
 * 同步方法:
 *      修饰符 synchronized 返回值类型 方法名 () {}
 *
 * 特点:
 *      同步方法在同一时间只能被唯一线程对象所调用,其他线程处理阻塞状态(排队)
 *      换种说法:在同一时间,栈内存中只能存在唯一的同步方法,
 *          只有当同步方法执行完毕出栈,其它线程才能继续调用
 */
public class ThreadDemo07 {
	public static void main(String[] args) {
		//创建卖票的动作对象
		Ticket ticket = new Ticket();

		//创建3个窗口对象
		Thread t1 = new Thread(ticket, "窗口1");
		Thread t2 = new Thread(ticket, "窗口2");
		Thread t3 = new Thread(ticket, "窗口3");

		//开启线程
		t1.start();
		t2.start();
		t3.start();
	}
}

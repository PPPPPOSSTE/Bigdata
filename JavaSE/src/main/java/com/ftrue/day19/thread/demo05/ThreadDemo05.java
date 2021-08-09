package com.ftrue.day19.thread.demo05;

/**
 * @ClassName ThreadDemo05
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月21日 11时32分
 * @Version 1.0
 *
 * 线程安全问题:多条线程处理同一数据资源
 *      同一数据被执行了多次
 *      执行不存在的数据
 *
 * 需求:模拟3个窗口卖100张票
 *
 *
 * 线程安全的解决方案:
 *      (1)同步代码块
 *      (2)同步方法
 *      (3)Lock锁(暂不涉及)
 *
 * 同步单词:synchronized
 *
 */
public class ThreadDemo05 {
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

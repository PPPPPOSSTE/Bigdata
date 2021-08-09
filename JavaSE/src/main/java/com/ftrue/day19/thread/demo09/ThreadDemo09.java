package com.ftrue.day19.thread.demo09;

/**
 * @ClassName ThreadDemo09
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月21日 15时28分
 * @Version 1.0
 */
public class ThreadDemo09 {
	public static void main(String[] args) {
		//创建同一资源对象
		BaoZi bz = new BaoZi();

		//创建生产者和消费者的线程对象
		Thread bzp = new Thread(new BaoZiPu(bz), "包子铺");
		Thread s1 = new Thread(new Student(bz), "学生1");
		Thread s2 = new Thread(new Student(bz), "学生2");
		Thread s3 = new Thread(new Student(bz), "学生3");

		//开启线程
		bzp.start();
		s1.start();
		s2.start();
		s3.start();
	}
}

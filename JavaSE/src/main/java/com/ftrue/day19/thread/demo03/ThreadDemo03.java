package com.ftrue.day19.thread.demo03;

/**
 * @ClassName ThreadDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月21日 11时13分
 * @Version 1.0
 *
 * 线程开启的方式2:实现Runnable接口
 *      1.创建Runnable接口的实现类
 *      2.重写Runnable接口中的run(),其实就是线程的执行动作
 *      3.在测试类中创建Runnable接口的实现类对象
 *      4.根据需求和Runnable接口的实现类对象创建合适数量的Thread对象
 *      5.开启线程
 *
 * 继承Thread类和实现Runnable接口,在实际开发中如何选择?
 *      推荐实现Runnable接口,实现接口可以有效避免单继承的局限性
 */
public class ThreadDemo03 {
	public static void main(String[] args) {
		//3.在测试类中创建Runnable接口的实现类对象
		MyRunnable my = new MyRunnable();

		//4.根据需求和Runnable接口的实现类对象创建合适数量的Thread对象
		Thread t1 = new Thread(my,"自定义线程1");
		Thread t2 = new Thread(my,"自定义线程2");

		//5.开启线程
		t1.start();
		t2.start();
	}
}

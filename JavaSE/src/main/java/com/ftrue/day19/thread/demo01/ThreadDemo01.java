package com.ftrue.day19.thread.demo01;

/**
 * @ClassName ThreadDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月21日 09时26分
 * @Version 1.0
 *
 * 并发和并行
 *      并发:在同一时间段内发生的多件事情
 *      并行:在同一时间发生的多件事情
 *
 * 电脑中CPU处理应用程序的规则:
 *      CPU做高速无规则的切换
 *
 * 进程和线程
 *      进程:操作系统中的应用程序
 *          每个应用程序至少拥有一个进程,应用程序进程越多,抢到CPU资源的概率也越大,弊端,可能导致其它程序崩掉概率增大,因为这个程序电脑也会越卡
 *
 *      线程:是进程中的执行单元
 *          每个进程中指向拥有一个线程
 *
 *
 * Java程序开启线程方式:
 *      1.继承Thread类
 *      2.实现Runnable接口,通过实现类创建线程
 *      3.实现Callable接口()(暂不讲解)
 *      4.线程池(暂不讲解)
 *
 * Thread类
 *      类的特点
 *          线程 是程序中的执行线程。Java 虚拟机允许应用程序并发地运行多个执行线程。
 *      类的位置
 *          java.lang
 *      类的构造器
 *          public Thread()
 *              分配新的 Thread 对象。
 *          public Thread(String name)
 *              分配新的 Thread 对象。
 *          public Thread(Runnable target)
 *              分配新的 Thread 对象。
 *          public Thread(Runnable target,String name)
 *              分配新的 Thread 对象。
 *      类的方法
 *          public static Thread currentThread()
 *              返回对当前正在执行的线程对象的引用。
 *          public final String getName()
 *              返回该线程的名称。
 *          public void run()
 *              如果该线程是使用独立的 Runnable 运行对象构造的，则调用该 Runnable 对象的 run 方法；
 *              否则，该方法不执行任何操作并返回。Thread 的子类应该重写该方法。
 *          public void start()
 *              使该线程开始执行；Java 虚拟机调用该线程的 run 方法。
 *          public static void sleep(long millis)
 *              在指定的毫秒数内让当前正在执行的线程休眠（暂停执行），此操作受到系统计时器和调度程序精度和准确性的影响。
 *
 * 注意事项:
 *      Java语言本身就是一套多线程程序,至少存在两条线程,一条main主线程,另外一条垃圾回收器线程
 *
 */
public class ThreadDemo01 {
	public static void main(String[] args) throws InterruptedException {
		//获取当前正在执行的线程对象
		Thread t = Thread.currentThread();

		//获取线程的名字
		System.out.println(t.getName());

		//模拟春晚最后倒计时
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}

		System.out.println("过年啦,春节好");
	}
}

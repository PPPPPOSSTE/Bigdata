package com.ftrue.day19thread.thread.demo06;

/**
 * @ClassName: Demo05Thread
 * @Description:
 * @Author: zhiqi zhang on 2021/7/21 11:32
 * @Version: 1.0
 */
/**

  同步代码块:
       synchronized (锁对象) {
           可能出现线程安全的代码
       }

  特点:
       同步代码块中的代码在同一时间只能被一条线程对象执行,其他线程处于阻塞状态(排队)

  锁对象:所有的线程对象共享同一锁对象,否则无法解决线程安全问题

  多条线程处理同一数据资源,且执行动作相同,
       锁对象就是动作对象(实现Runnable接口的实现类对象)
  多条线程处理同一数据资源,且每条线程执行动作不相同,
       锁对象就是同一数据资源的对象
  多线线程处理同一数据资源是静态成员,
       锁对象就是同一数据资源的类对象



 */
public class Demo06Thread {
    public static void main(String[] args) {
        //创建线程任务对象
        Ticket ticket = new Ticket();

        //创建三个窗口对象
        Thread t1 = new Thread(ticket, "窗口1");
        Thread t2 = new Thread(ticket, "窗口2");
        Thread t3 = new Thread(ticket, "窗口3");

        //同时卖票
        t1.start();
        t2.start();
        t3.start();
    }
}

package com.ftrue.day19thread.thread.demo07;

/**
 * @ClassName: Demo05Thread
 * @Description:
 * @Author: zhiqi zhang on 2021/7/21 11:32
 * @Version: 1.0
 */
/**

  同步方法:
       修饰符 synchronized 返回值类型 方法名 () {}

  特点:
       同步方法在同一时间只能被唯一线程对象所调用,其他线程处理阻塞状态(排队)
       换种说法:在同一时间,栈内存中只能存在唯一的同步方法,
           只有当同步方法执行完毕出栈,其它线程才能继续调用
 */
public class Demo07Thread {
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

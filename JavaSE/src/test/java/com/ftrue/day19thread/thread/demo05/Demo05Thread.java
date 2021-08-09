package com.ftrue.day19thread.thread.demo05;

/**
 * @ClassName: Demo05Thread
 * @Description:
 * @Author: zhiqi zhang on 2021/7/21 11:32
 * @Version: 1.0
 */
/**

  线程安全问题:多条线程处理同一数据资源
       同一数据被执行了多次
       执行不存在的数据

  需求:模拟3个窗口卖100张票


  线程安全的解决方案:
       (1)同步代码块
       (2)同步方法
       (3)Lock锁(暂不涉及)

  同步单词:synchronized

 */
public class Demo05Thread {
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

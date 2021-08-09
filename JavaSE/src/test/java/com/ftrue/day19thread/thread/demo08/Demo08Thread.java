package com.ftrue.day19thread.thread.demo08;

/**
 * @ClassName: Demo08Thread
 * @Description:
 * @Author: zhiqi zhang on 2021/7/21 15:01
 * @Version: 1.0
 */
/**

  线程间通信:(等待唤醒机制)
       让多条线程之间产生一定的联系,从而有规律(规则)的执行

  生产者和消费者:
       将生产资源的线程动作称之为"生产者"
       将消费资源的线程动作称之为"消费者"

  借助Object类的两个方法
       public final void notify()
           唤醒在此对象监视器上等待的单个线程。
       public final void notifyAll()
           唤醒在此对象监视器上等待的所有线程。
       public final void wait()
           在其他线程调用此对象的 notify() 方法或 notifyAll() 方法前，导致当前线程等待。
  注意事项:
       notify()唤醒线程的时候,始终唤醒等待时间最长的那条线程



  需求:
       包子铺做包子,学生吃包子
       同一资源类:包子类
       生产者:包子铺类
       消费者:学生类
 */
public class Demo08Thread {
    public static void main(String[] args) {
        //创建统一资源对象
        BaoZi bz = new BaoZi();

        //创建生产者和消费者的执行动作对象
        Thread bzp = new Thread(new BaoZiPu(bz), "包子铺");
        Thread stu = new Thread(new Student(bz), "学生");

        //开启线程
        bzp.start();
        stu.start();
    }
}

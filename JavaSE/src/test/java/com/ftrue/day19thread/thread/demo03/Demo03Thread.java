package com.ftrue.day19thread.thread.demo03;

/**
 * @ClassName: Demo03Thread
 * @Description:
 * @Author: zhiqi zhang on 2021/7/21 11:14
 * @Version: 1.0
 */
/**

  线程开启的方式2:实现Runnable接口
       1.创建Runnable接口的实现类
       2.重写Runnable接口中的run(),其实就是线程的执行动作
       3.在测试类中创建Runnable接口的实现类对象
       4.根据需求和Runnable接口的实现类对象创建合适数量的Thread对象
       5.开启线程

  继承Thread类和实现Runnable接口,在实际开发中如何选择?
       推荐实现Runnable接口,实现接口可以有效避免单继承的局限性
 */
public class Demo03Thread {
    public static void main(String[] args) {
        //创建自定义类对象  线程任务对象
        MyRunnable mr = new MyRunnable();

        //创建线程对象
        Thread t1 = new Thread(mr, "自定义线程1");
        Thread t2 = new Thread(mr, "自定义线程2");

        t1.start();
        t2.start();

    }
}

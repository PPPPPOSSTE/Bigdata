package com.ftrue.day19thread.thread.demo12;


/**
 * @ClassName: Demo10Thread
 * @Description:
 * @Author: zhiqi zhang on 2021/7/21 16:08
 * @Version: 1.0
 */
/*
 * 在多线程中的单例设计模式（懒汉式方式）的线程安全问题的解决方案：同步方法
 *
 * */
public class Demo12Thread {
    public static void main(String[] args) {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println(CEO.getCEO());
            }
        };

        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);

        t1.start();
        t2.start();
        t3.start();

    }
}

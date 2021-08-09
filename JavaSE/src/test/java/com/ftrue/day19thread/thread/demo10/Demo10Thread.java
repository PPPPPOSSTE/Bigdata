package com.ftrue.day19thread.thread.demo10;

/**
 * @ClassName: Demo10Thread
 * @Description:
 * @Author: zhiqi zhang on 2021/7/21 16:08
 * @Version: 1.0
 */
/*
 * 在多线程中的单例设计模式（懒汉式方式）的线程安全问题演示
 *
 * */
public class Demo10Thread {
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


        /*System.out.println(CEO.getCEO());
        System.out.println(CEO.getCEO());
        System.out.println(CEO.getCEO());*/
    }
}

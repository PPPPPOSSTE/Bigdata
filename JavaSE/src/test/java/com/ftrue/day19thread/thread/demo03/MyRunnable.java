package com.ftrue.day19thread.thread.demo03;

/**
 * @ClassName: MyRunnable
 * @Description:
 * @Author: zhiqi zhang on 2021/7/21 9:42
 * @Version: 1.0
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

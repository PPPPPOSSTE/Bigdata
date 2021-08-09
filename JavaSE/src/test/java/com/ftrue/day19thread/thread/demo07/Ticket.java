package com.ftrue.day19thread.thread.demo07;

/**
 * @ClassName: Ticket
 * @Description:
 * @Author: zhiqi zhang on 2021/7/21 11:07
 * @Version: 1.0
 */
public class Ticket implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (ticket > 0) {
            method();
        }
    }

    private synchronized void method() {
        if (ticket > 0) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //获取线程的名字
            //getName() 此时该方法不能直接使用
            String name = Thread.currentThread().getName();
            System.out.println(name + "正在卖第" + ticket-- + "张票");
        }
    }
}

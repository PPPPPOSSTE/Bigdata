package com.ftrue.day19thread.thread.demo05;

/**
 * @ClassName: Ticket
 * @Description:
 * @Author: zhiqi zhang on 2021/7/21 11:07
 * @Version: 1.0
 */
public class Ticket implements Runnable {
    //声明初始化票的张数
    private int ticket = 100;

    @Override
    public void run() {
        while (ticket > 0) {
            //在实际开发中,此处可能存在多行功能性代码,使用sleep睡眠指定的毫秒数模拟程序执行的实现
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //获取线程的名字
            //getName() 此时该方法不能直接使用，Thread类中才有此方法。
            String name = Thread.currentThread().getName();
            //线程安全产生的地方：对实例变量进行修改操作
            System.out.println(name + "正在卖第" + ticket-- + "张票");
        }
    }
}

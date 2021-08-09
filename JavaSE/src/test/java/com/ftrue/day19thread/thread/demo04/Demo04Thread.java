package com.ftrue.day19thread.thread.demo04;

/**
 * @ClassName: Demo04Thread
 * @Description:
 * @Author: zhiqi zhang on 2021/7/21 11:21
 * @Version: 1.0
 */
/**

  使用匿名内部类方式简化线程开启的方式2
       1.在测试类中使用匿名内部类创建Runnable接口的实现类对象
       2.根据需求和Runnable接口的实现类对象创建合适数量的Thread对象
       3.开启线程
 */
public class Demo04Thread {
    public static void main(String[] args) {
        //匿名内部类
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        };

        new Thread(r, "自定义线程1").start();
        new Thread(r, "自定义线程2").start();
    }
}

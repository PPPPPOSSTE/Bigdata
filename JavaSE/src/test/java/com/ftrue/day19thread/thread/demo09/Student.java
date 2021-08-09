package com.ftrue.day19thread.thread.demo09;

/**
 * @ClassName: Student
 * @Description:
 * @Author: zhiqi zhang on 2021/7/21 15:19
 * @Version: 1.0
 */
public class Student implements Runnable {
    private BaoZi bz;

    public Student(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                //判断包子的状态
                if (bz.getFlag()) {
                    //如果执行到这里, 说明包子资源存在，学生购买包子
                    String name = Thread.currentThread().getName();
                    System.out.println(name + ":学生购买包子，开始吃包子，包子真好吃~~~");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //学生购买包子，包子资源就会被消费掉，修改包子资源的状态
                    bz.setFlag(false);

                    //通知包子铺老板做包子
                    bz.notify();  //会有问题：可能会导致所有线程处于wait状态（包括生产者线程），最终程序会卡住，所有线程都不会执行。
                    //bz.notifyAll();  //学生在唤醒的时候必须保证唤醒生产者
                } else {
                    //如果执行到这里, 说明包子资源不存在，学生排队等待包子做好
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

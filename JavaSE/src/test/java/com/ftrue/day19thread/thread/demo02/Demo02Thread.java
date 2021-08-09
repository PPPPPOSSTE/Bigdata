package com.ftrue.day19thread.thread.demo02;

/**
 * @ClassName: Demo02Thread
 * @Description:
 * @Author: zhiqi zhang on 2021/7/21 9:45
 * @Version: 1.0
 */
/**

  需要多少条线程就要创建多少个Thread类或者Thread的子类对象

  线程开启的方式1:继承Thread类
       1.创建Thread类的子类
       2.根据Thread类生成合适的构造器
       3.在Thread类的子类中重写Thread类中run(),就是让多线程执行的动作代码;
       4.在测试类中创建合适数量的Thread类的子类对象(需要多少条线程就创建多少个子类对象)
       5.开启线程

  注意事项:
       多条线程执行的动作是各做各个事情,无需理会线程安全问题
 */
public class Demo02Thread {
    public static void main(String[] args) {
        //创建2条执行线程
        MyThread t1 = new MyThread("自定义线程1");
        MyThread t2 = new MyThread("自定义线程2");

        //不要这样使用，这样使用没有开启新的线程，还是在main线程里面在执行
        //t1.run();
        //t2.run();

        //开启新线程
        t1.start();
        t2.start();
    }
}

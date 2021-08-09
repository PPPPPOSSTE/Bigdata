package com.ftrue.day22exam.exercise01;

/**
 * @ClassName: Exercise0130
 * @Description:
 * @Author: zhiqi zhang on 2021/7/23 0:17
 * @Version: 1.0
 */
//30.	在{1}添加什么代码，可以保证如下代码输出100
//提示：t.wait()  或  t.join()  或 t.yield() 或  t.interrupt()？
public class Exercise0130 {
    public static void main(String[] args) throws InterruptedException {
        MyThread m = new MyThread();
        Thread t = new Thread(m);
        t.start();

        //{1}
        t.join();

        int j = m.i;
        System.out.println(j);
    }

}

class MyThread implements Runnable {
    int i;

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i = 100;
    }
}


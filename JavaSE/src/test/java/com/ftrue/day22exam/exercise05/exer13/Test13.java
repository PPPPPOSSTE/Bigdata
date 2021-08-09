package com.ftrue.day22exam.exercise05.exer13;

/**
 * @ClassName: Test13
 * @Description:
 * @Author: zhiqi zhang on 2021/7/26 11:33
 * @Version: 1.0
 */
public class Test13 {
    public static void main(String[] args) {
        Houseware houseware = new Houseware();

        Thread p = new Thread(new Producer(houseware), "生产者");
        Thread c = new Thread(new Consumer(houseware), "消费者");

        p.start();
        c.start();
    }
}

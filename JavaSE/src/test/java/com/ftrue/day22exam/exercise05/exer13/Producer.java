package com.ftrue.day22exam.exercise05.exer13;

import java.util.Random;

/**
 * @ClassName: Producer
 * @Description:
 * @Author: zhiqi zhang on 2021/7/26 11:34
 * @Version: 1.0
 */
public class Producer implements Runnable {
    private Houseware houseware;

    public Producer(Houseware houseware) {
        this.houseware = houseware;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            houseware.put(random.nextInt());
        }
    }
}

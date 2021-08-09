package com.ftrue.day22exam.exercise06.exer04;

import java.util.Random;

/**
 * @ClassName: Test03
 * @Description:
 * @Author: zhiqi zhang on 2021/7/26 20:34
 * @Version: 1.0
 */
//TODO "Done" 需求还没完成
public class Test04 {
    public static void main(String[] args) throws InterruptedException {
        int count = 50;
        Integer[] arr = new Integer[count];
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            arr[i] = random.nextInt();
        }
        Thread t1 = new Thread(new Odd(arr));
        Thread t2 = new Thread(new Even(arr));

        t1.start();
        t2.start();

    }
}

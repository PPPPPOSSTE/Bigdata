package com.ftrue.day22exam.exercise06.exer04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName: Ood
 * @Description:
 * @Author: zhiqi zhang on 2021/7/26 20:37
 * @Version: 1.0
 */
public class Odd implements Runnable {
    private Integer[] arr;
//    private BufferedWriter bw;

    public Odd(Integer[] arr/*, BufferedWriter bw*/) {
        this.arr = arr;
//        this.bw = bw;
    }

    @Override
    public void run() {
        boolean flag = false;
        int length = arr.length;
        int index = 0;
        int stop = 0;

        BufferedWriter bw = null;

        while (true) {
            try {
                bw = new BufferedWriter(new FileWriter("file\\test0604.txt", true));
            } catch (IOException e) {
                e.printStackTrace();
            }

            synchronized (arr) {
                while (stop < 10) {
                    if (arr[index] % 2 != 0) {
                        try {
                            bw.write(arr[index] + " ");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        stop++;
                    }
                    index++;
                    if (index == length) {
                        flag = true;
                        break;
                    }
                }

                stop = 0;

                try {
                    bw.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                arr.notify();

                if (flag) {
                    break;
                }

                try {
                    arr.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

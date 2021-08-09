package com.ftrue.day08test;

import java.util.Scanner;

/**
 * @ClassName: Test02Random
 * @Description:
 * @Author: zhangzhiqi on 2021/7/3 23:30
 * @Version: 1.0
 */
public class Test02Random {
    public static void main(String[] args) {
        method03();
    }

    public static void method03() {
        int num = (int) (Math.random() * 100 + 1);
        System.out.println("正确数值是：" + num);

        Scanner sc = new Scanner(System.in);
        int start = 1;
        int end = 100;

        while (true) {
            System.out.println("请键盘录入一个" + start + "-" + end + "");
            int guessNumber = sc.nextInt();

            if (guessNumber > num) {
                System.out.println("你猜的数据" + guessNumber + "大了");
            } else if (guessNumber < num) {
                System.out.println("你猜的数据" + guessNumber + "小了");
            } else {
                System.out.println("恭喜你，猜中了");
                break;
            }
        }

    }
}

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
        int num = (int) (Math.random() * 100 + 1);
        System.out.println("正确数值是：" + num);

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要猜的数字（1-100）：");
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

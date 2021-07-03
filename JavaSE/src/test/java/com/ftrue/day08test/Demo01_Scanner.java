package com.ftrue.day08test;

import java.util.Scanner;

/**
 * @ClassName: Demo01_Scanner
 * @Description:
 * @Author: zhangzhiqi on 2021/7/3 23:18
 * @Version: 1.0
 */
public class Demo01_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请录入一个整数：");
        int i = sc.nextInt();

        System.out.println("i = " + i);
    }
}

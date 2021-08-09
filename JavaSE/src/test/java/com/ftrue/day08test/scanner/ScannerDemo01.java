package com.ftrue.day08test.scanner;

import java.util.Scanner;

/**
 * @ClassName: ScannerDemo01
 * @Description:
 * @Author: zhangzhiqi on 2021/7/6 16:23
 * @Version: 1.0
 */
public class ScannerDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请键盘录入一个整数");
        int num = sc.nextInt();
        System.out.println("num = " + num);

        sc.close();
    }
}

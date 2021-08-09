package com.ftrue.day22exam.exercise02.exer12;

import java.util.Scanner;

/**
 * @ClassName: Test12
 * @Description:
 * @Author: zhiqi zhang on 2021/7/24 22:37
 * @Version: 1.0
 */
public class Test12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("今天星期几（1-7）：");
        int number = input.nextInt();  //假设输入的是2
        Week w = Week.getByNumber(number);
        System.out.println("今天是：" + w);  //今天是：TUESDAY(2,星期二)
    }
}

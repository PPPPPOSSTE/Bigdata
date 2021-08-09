package com.ftrue.day14test.exercise.exer04;

import java.util.Scanner;

/**
 * @ClassName: Exercise02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/14 21:07
 * @Version: 1.0
 */
/*
 *
 * 第4题
 * 生成一个随机100内小数，转换为保留两位小数的字符串，不考虑四舍五入的问题。
 *
 * note: String的indexOf方法
 * */
public class Exercise04 {
    public static void main(String[] args) {
        double rand = Math.random() * 100;
        System.out.println("随机数为：" + rand);

        String str = String.valueOf(rand);
        //System.out.println("str = " + str);

        int index = str.indexOf(".");

        String result = str.substring(0, index + 3);
        System.out.println("截取小数点后两位后为：" + result);
    }
}

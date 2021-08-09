package com.ftrue.day14test.exercise.exer01;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName: Exercise01
 * @Description:
 * @Author: zhiqi zhang on 2021/7/14 20:45
 * @Version: 1.0
 */
/*
 *
 * 第一题
 * 反转键盘录入的字符串
 *
 * note: StringBuilder的reverse()方法（String没有此方法）
 * */
public class Exercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请键盘输入字符串：");

        String str = input.next();
        System.out.println("str = " + str);

        //char[] chars = str.toCharArray();
        //System.out.println(Arrays.toString(chars));

        //方式1
        /*String result = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            result = result + chars[i];
        }*/

        //方式2
        /*StringBuilder result = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            result.append(chars[i]);
        }*/

        //方式3
        StringBuilder s = new StringBuilder(str);
        String result = s.reverse().toString();

        System.out.println("反转后：" + result);

        input.close();
    }
}

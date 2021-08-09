package com.ftrue.day14test.exercise.exer02;

import java.util.Scanner;

/**
 * @ClassName: Exercise02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/14 21:07
 * @Version: 1.0
 */
/*
 *
 * 第2题
 * 键盘录入QQ号码，验证格式的正确性。
 *     必须是5-12位数字
 *     0不能开头
 *
 * note: String的match方法
 *
 * */
public class Exercise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入qq号码：");
        String qq = input.next();
        System.out.print("这个qq号是否正确：");

        /*int length = qq.length();
        char start = qq.charAt(0);
        boolean flag = false;
        if (length >= 5 && length <= 12 && start != '0') {
            flag = true;
            char[] chars = qq.toCharArray();
            for (char aChar : chars) {
                if (aChar < '0' || aChar > '9') {
                    flag = false;
                    break;
                }
            }
        }
        System.out.println(flag);*/

        //根据需求写正则表达式
        String reg = "[1-9][0-9]{4,11}+";
        System.out.println(qq.matches(reg));

        input.close();
    }
}

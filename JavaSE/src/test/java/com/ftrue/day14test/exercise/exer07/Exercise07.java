package com.ftrue.day14test.exercise.exer07;


import java.util.Scanner;

/**
 * @ClassName: Exercise02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/14 21:07
 * @Version: 1.0
 */
/*
 *
 * 第7题
 * 校验密码是否合法。
        必须至少9个字符。
        必须至少2个大写字符。
        必须包含字母和数字。
 *
 *
 * */
public class Exercise07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个合法密码：");
        String str = sc.next();

        int length = str.length();
        boolean isLengthLegal = false;
        int countUpperCase = 0;
        boolean letter = false;
        boolean digit = false;
        boolean isLegal = false;

        if (length >= 9) {
            isLengthLegal = true;
            char[] chars = str.toCharArray();
            for (char aChar : chars) {
                if (aChar >= 'A' && aChar <= 'Z') {
                    countUpperCase++;
                    letter = true;
                } else if (aChar >= 'a' && aChar <= 'z') {
                    letter = true;
                } else if (aChar >= '0' && aChar <= '9') {
                    digit = true;
                }
            }
        }

        if (isLengthLegal && countUpperCase >= 2 && letter && digit) {
            isLegal = true;
        }

        System.out.println(str + "是否合法：" + isLegal);
    }
}


//测试案例
//at1Gui2Gu  //true
//at1Gui2G   //false
//at1Gui2gu   //false
//ataGuiaGu   //false


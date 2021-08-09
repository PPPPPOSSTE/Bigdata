package com.ftrue.day14test.exercise.exer06;


import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 * @ClassName: Exercise02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/14 21:07
 * @Version: 1.0
 */
/*
 *
 * 第6题
 * 判断回文字符串。如果一个字符串，从前向后读和从后向前读，都是一个字符串，称为回文串，比如mom，dad，noon。
 *
 * note: 工具类Objects的equals方法使用
 *
 * */
public class Exercise06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个回文字符串：");
        String str = sc.next();

        //方法1
        /*char[] chars = str.toCharArray();
        int length = chars.length;

        char temp;
        for (int i = 0; i < chars.length / 2; i++) {
            temp = chars[i];
            chars[i] = chars[length - i - 1];
            chars[length - i -1] = temp;
        }

        String strNew = String.valueOf(chars);

        boolean isEquals = str.equals(strNew);

        System.out.println("回文数：" + isEquals);*/

        //方法2：参考答案
        StringBuilder stringBuilder = new StringBuilder(str);
        String strNew = stringBuilder.reverse().toString();
        System.out.println("回文数：" + Objects.equals(str, strNew));
    }
}


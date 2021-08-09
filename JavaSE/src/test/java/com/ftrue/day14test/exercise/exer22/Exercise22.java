package com.ftrue.day14test.exercise.exer22;


import java.io.UnsupportedEncodingException;

/**
 * @ClassName: Exercise02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/14 21:07
 * @Version: 1.0
 */
/*
 *
 * 第22题
 * 案例：
        获取两个字符串中最大相同子串。比如：
        str1 = "abcwerthelloyuiodef";str2 = "cvhellobnm"的最大相同子串是"hello"
 *
 *
 * */
public class Exercise22 {
    public static void main(String[] args) {
        String str1 = "abcwerthelloyuiodef";
        String str2 = "cvhellobnm";
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        long start = System.nanoTime();
        String same = maxSameSubString(str1, str2);
        //String same = maxSameSubString2(str1, str2);   //261300
        System.out.println("最大相同子串是：" + same);
        long end = System.nanoTime();
        System.out.println(end - start);
    }

    //找出字符串长度小的，循环从最长的字符串（逐渐缩小字符串长度，即每次减一），看另一个字符串是否包含此字符串，满足条件就退出循环
    public static String maxSameSubString2(String str1, String str2) {
        String longStr = str1.length() > str2.length() ? str1 : str2;
        String shortStr = str1.length() <= str2.length() ? str1 : str2;
        int length = shortStr.length();

        String same = "";
        for (int i = 0; i < length; i++) {
            for (int left = 0, right = length - i; right <= length ; left++, right++) {
                String temp = shortStr.substring(left, right);
                if (longStr.contains(temp)) {
                    same = temp;
                    break;
                }
            }
            if (same.length() > 0) {
                break;
            }
        }
        return same;
    }

    public static String maxSameSubString(String str1, String str2) {
        String longStr = str1.length() > str2.length() ? str1 : str2;
        String shortStr = str1.length() <= str2.length() ? str1 : str2;

        String same = "";
        for (int left = 0; left < shortStr.length(); left++) {
            for (int right = shortStr.length(); right > left; right--) {
                String temp = shortStr.substring(left, right);
                if (longStr.contains(temp) && temp.length() > same.length()) {
                    same = temp;
                    break;
                }
            }

        }
        return same;
    }
}





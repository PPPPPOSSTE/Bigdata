package com.ftrue.day14test.exercise.exer10;


import java.util.Arrays;

/**
 * @ClassName: Exercise02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/14 21:07
 * @Version: 1.0
 */
/*
 *
 * 第10题
 * 有一个字符串String abc = “342567891”，请写程序将字符串abc进行升序，可以使用JDK API中的现有的功能方法。
 *
 * note: Arrays类的sort方法的使用
 * */
public class Exercise10 {
    public static void main(String[] args) {
        String abc = "342567891";

        char[] chars = abc.toCharArray();

        Arrays.sort(chars);

        String result = String.valueOf(chars);

        System.out.println("result = " + result);
    }
}

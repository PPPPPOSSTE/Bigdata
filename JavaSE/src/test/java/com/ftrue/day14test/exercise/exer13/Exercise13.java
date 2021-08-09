package com.ftrue.day14test.exercise.exer13;


/**
 * @ClassName: Exercise02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/14 21:07
 * @Version: 1.0
 */
/*
 *
 * 第13题
 *
 *
 * */
public class Exercise13 {
    public static void main(String[] args) {
        String str = new String("world");
        char[] ch = new char[]{'h', 'e', 'l', 'l', 'o'};
        change(str, ch);
        System.out.println(str);
        System.out.println(String.valueOf(ch));
    }

    public static void change(String str, char[] arr) {
        str = "change";
        arr[0] = 'a';
        arr[1] = 'b';
        arr[2] = 'c';
        arr[3] = 'd';
        arr[4] = 'e';
    }
}

//world
//abcde
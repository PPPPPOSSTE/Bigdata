package com.ftrue.day14test.exercise.exer17;


/**
 * @ClassName: Exercise02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/14 21:07
 * @Version: 1.0
 */
/*
 *
 * 第17题
 *
 *
 * */
public class Exercise17 {
    private static void change(String s, StringBuffer sb) {
        s = "aaaa";
        sb.setLength(0);
        sb.append("aaaa");
    }

    public static void main(String[] args) {
        String s = "aaaa";
        StringBuffer sb = new StringBuffer("bbbb");
        change(s, sb);
        System.out.println(s + sb);
    }
}

//aaaaaaaa


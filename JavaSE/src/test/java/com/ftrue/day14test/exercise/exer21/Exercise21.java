package com.ftrue.day14test.exercise.exer21;


import java.io.UnsupportedEncodingException;

/**
 * @ClassName: Exercise02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/14 21:07
 * @Version: 1.0
 */
/*
 *
 * 第21题
 *
 *
 * */
public class Exercise21 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "中国";
        System.out.println(str.getBytes("UTF-8").length);
        System.out.println(str.getBytes("GBK").length);
        System.out.println(str.getBytes("ISO-8859-1").length);
        System.out.println(new String(str.getBytes("ISO-8859-1"), "ISO-8859-1"));
        System.out.println(new String(str.getBytes("UTF-8"), "UTF-8"));
        System.out.println(new String(str.getBytes("GBK"), "GBK"));
    }
}

//6
//4
//2
//??
//中国
//中国



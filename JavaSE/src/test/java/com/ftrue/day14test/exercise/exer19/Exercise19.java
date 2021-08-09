package com.ftrue.day14test.exercise.exer19;


/**
 * @ClassName: Exercise02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/14 21:07
 * @Version: 1.0
 */
/*
 *
 * 第19题
 *
 *
 * */
public class Exercise19 {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");

        operate(a, b);
        System.out.println(a + "," + b);
    }

    public static void operate(StringBuffer a, StringBuffer b) {
        a.append(b);
        b = a;
    }
}

//AB,B


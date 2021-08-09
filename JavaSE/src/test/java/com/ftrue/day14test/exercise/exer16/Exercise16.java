package com.ftrue.day14test.exercise.exer16;


import com.ftrue.day11test.Test;

/**
 * @ClassName: Exercise02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/14 21:07
 * @Version: 1.0
 */
/*
 *
 * 第16题
 *
 *
 * */
public class Exercise16 {
    int a;
    int b;
    String str;

    public void f() {
        a = 0;
        b = 0;
        str = "hello";
        int[] c = {0};
        g(b, c, str);
        System.out.println(a + " " + b + " " + c[0] + "," + str);
    }

    public void g(int b, int[] c, String s) {
        a = 1;
        b = 1;
        c[0] = 1;
        s = "world";
    }

    public static void main(String[] args) {
        Exercise16 t = new Exercise16();
        t.f();
    }
}


//1 0 1,hello
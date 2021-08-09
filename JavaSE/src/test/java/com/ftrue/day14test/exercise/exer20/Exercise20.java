package com.ftrue.day14test.exercise.exer20;


/**
 * @ClassName: Exercise02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/14 21:07
 * @Version: 1.0
 */
/*
 *
 * 第20题
 *
 *
 * */
public class Exercise20 {
    public static void f(Text tIn, int intIn, Integer integerIn, String strIn) {
        tIn.num = 200;
        tIn.str = "bcd";
        intIn = 200;
        integerIn = 200;
        strIn = "bcd";
    }

    public static void main(String[] args) {
        Text tIn = new Text(100, "abc");
        int intIn = 100;
        Integer integerIn = 100;
        String strIn = "abc";
        f(tIn, intIn, integerIn, strIn);
        System.out.println(tIn.num + tIn.str + intIn + integerIn + strIn);
    }
}

//200bcd100100abc

class Text {
    public int num;
    public String str;

    public Text(int num, String str) {
        this.num = num;
        this.str = str;
    }
}


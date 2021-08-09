package com.ftrue.day10test;

/**
 * @ClassName: ExtendsDemo07
 * @Description:
 * @Author: zhangzhiqi on 2021/7/5 8:42
 * @Version: 1.0
 */
class Fu7 {
    private int n;

    Fu7() {
        System.out.println("Fu()");
    }
}

class Zi7 extends Fu7 {
    Zi7() {
        //super();  //写或不写效果一样，默认会先调用父类的构造方法
        System.out.println("Zi7()");
    }
}

public class ExtendsDemo07 {
    public static void main(String args[]) {
        Zi7 zi = new Zi7();
    }
}


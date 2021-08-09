package com.ftrue.day10test;

/**
 * @ClassName: ExtendDemo02
 * @Description:
 * @Author: zhangzhiqi on 2021/7/4 15:01
 * @Version: 1.0
 */
//成员变量不重名
class Fu {
    int num01 = 3;
}

class Zi extends Fu {
    int num02 = 4;

    public void show() {
        System.out.println("num01 = " + num01);
        System.out.println("num02 = " + num02);
    }
}

public class ExtendDemo02 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}

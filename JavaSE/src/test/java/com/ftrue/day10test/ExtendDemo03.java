package com.ftrue.day10test;

/**
 * @ClassName: ExtendDemo02
 * @Description:
 * @Author: zhangzhiqi on 2021/7/4 15:01
 * @Version: 1.0
 */
//成员变量不重名、成员变量重名
class Fu2 {
    int num = 3;
}

class Zi2 extends Fu2 {
    int num = 4;

    public void show() {
        System.out.println("num = " + num);
        System.out.println("num_super = " + super.num);
        System.out.println("num_this = " + this.num);
    }
}

public class ExtendDemo03 {
    public static void main(String[] args) {
        Zi2 z = new Zi2();
        z.show();
    }
}

//num = 4
//num_super = 3
//num_this = 4

package com.ftrue.day10test;

/**
 * @ClassName: ExtendsDemo04
 * @Description:
 * @Author: zhangzhiqi on 2021/7/4 15:26
 * @Version: 1.0
 */
class Fu4 {
    public void show() {
        System.out.println("Fu类中的show方法执行");
    }
}

class Zi4 extends Fu4 {
    public void show2() {
        System.out.println("Zi类中的show2方法执行");
    }
}

public class ExtendsDemo04 {
    public static void main(String[] args) {
        Zi4 z = new Zi4();
        //子类中没有show方法，但是可以找到父类方法去执行
        z.show();
        z.show2();
    }
}

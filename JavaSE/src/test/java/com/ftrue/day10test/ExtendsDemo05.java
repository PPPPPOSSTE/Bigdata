package com.ftrue.day10test;

/**
 * @ClassName: ExtendsDemo05
 * @Description:
 * @Author: zhangzhiqi on 2021/7/4 15:27
 * @Version: 1.0
 */
class Fu5 {
    public void show() {
        System.out.println("Fu show");
    }
}

class Zi5 extends Fu5 {
    //子类重写了父类的show方法
    public void show() {
        System.out.println("Zi show");
    }
}

public class ExtendsDemo05 {
    public static void main(String[] args) {
        Zi5 z = new Zi5();
        // 子类中有show方法，只执行重写后的show方法
        z.show(); // Zi show
    }
}

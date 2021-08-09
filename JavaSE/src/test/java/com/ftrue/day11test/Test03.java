package com.ftrue.day11test;

/**
 * @ClassName: Test03
 * @Description:
 * @Author: zhangzhiqi on 2021/7/5 21:26
 * @Version: 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        /*
        // 向上转型
        Animal11 a = new Cat11();
        a.eat(); // 调用的是 Cat 的 eat
        // 向下转型
        Dog11 d = (Dog11)a;
        d.watchHouse(); // 调用的是 Dog 的 watchHouse 【运行报错】
        //Exception in thread "main" java.lang.ClassCastException: com.ftrue.day11test.Cat11 cannot be cast to com.ftrue.day11test.Dog11
        //	at com.ftrue.day11test.Test03.main(Test03.java:15)
        */

        // 向上转型
        Animal11 a = new Cat11();
        a.eat(); // 调用的是 Cat 的 eat
        // 向下转型
        if (a instanceof Cat11) {
            Cat11 c = (Cat11) a;
            c.catchMouse(); // 调用的是 Cat 的 catchMouse
        } else if (a instanceof Dog11) {
            Dog11 d = (Dog11) a;
            d.watchHouse(); // 调用的是 Dog 的 watchHouse
        }
    }
}

package com.ftrue.day08test.demo01;

import com.ftrue.day08test.Singleton;

/**
 * @ClassName: testsimgle
 * @Description:
 * @Author: zhangzhiqi on 2021/7/6 11:08
 * @Version: 1.0
 */
public class testsimgle {
    public static void main(String[] args) {
        Singleton s = Singleton.getSingleton();

        s.show();

        Singleton s2 = Singleton.getSingleton();
        s2.show();

    }
}

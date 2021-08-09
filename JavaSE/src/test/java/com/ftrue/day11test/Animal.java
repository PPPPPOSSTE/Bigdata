package com.ftrue.day11test;

/**
 * @ClassName: Animal
 * @Description:
 * @Author: zhangzhiqi on 2021/7/5 19:53
 * @Version: 1.0
 */
public class Animal implements LiveAble {

    @Override
    public void eat() {
        System.out.println("吃东西");
    }

    @Override
    public void sleep() {
        System.out.println("晚上睡");
    }

    //无法重写静态方法
}

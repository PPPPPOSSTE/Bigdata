package com.ftrue.day10test.demo01;

/**
 * @ClassName: Cat
 * @Description:
 * @Author: zhiqi zhang on 2021/7/9 18:31
 * @Version: 1.0
 */
public class Cat extends Animal {
    public String name;
    public int age;

    public void eat () {
        System.out.println("干饭饭");
    }
    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}

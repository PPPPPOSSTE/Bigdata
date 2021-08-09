package com.ftrue.day12test.en.demo02;

/**
 * @ClassName: Sex
 * @Description:
 * @Author: zhiqi zhang on 2021/7/12 13:43
 * @Version: 1.0
 */
public enum Sex {
    boy("李雷", 18), girl("韩梅梅", 18);

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private Sex(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

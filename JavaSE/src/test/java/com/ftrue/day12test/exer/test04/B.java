package com.ftrue.day12test.exer.test04;

/**
 * @ClassName: B
 * @Description:
 * @Author: zhiqi zhang on 2021/7/12 18:52
 * @Version: 1.0
 */
public class B extends A {
    public String show(B obj) {
        return "B and B";
    }

    public String show(A obj) {
        return "B and A";
    }
}
